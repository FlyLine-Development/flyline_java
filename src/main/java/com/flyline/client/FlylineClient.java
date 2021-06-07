package com.flyline.client;

import com.flyline.client.internal.gson.CredentialInjectingTypeAdapterFactory;
import com.flyline.client.internal.gson.ImmutableListStripUnknownEnumsTypeAdapterFactory;
import com.flyline.client.internal.gson.OptionalTypeAdapterFactory;
import com.flyline.client.internal.gson.RequiredFieldTypeAdapterFactory;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public final class FlylineClient {
    private static final ConnectionSpec CONNECTION_SPEC = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
    private final FlylineApiService flylineApiService;
    private final Retrofit retrofit;
    private FlylineClient(FlylineApiService flylineApiService, Retrofit retrofit){
        this.flylineApiService = flylineApiService;
        this.retrofit = retrofit;
    }

    public FlylineApiService service(){
        return flylineApiService;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        public static long DEFAULT_READ_TIMEOUT_SECONDS = 300;
        public static long DEFAULT_CONNECT_TIMEOUT_SECONDS = 5;

        private final OkHttpClient.Builder okHttpClientBuilder;
        private String baseUrl;
        private HttpLoggingInterceptor.Level httpLogLevel;

        private GsonBuilder gsonBuilder;
        private Builder(){
            this.okHttpClientBuilder = new OkHttpClient.Builder()
                    .readTimeout(DEFAULT_READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .connectTimeout(DEFAULT_CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .followSslRedirects(false)
                    .connectionSpecs(Collections.singletonList(CONNECTION_SPEC));
            this.gsonBuilder = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .registerTypeAdapterFactory(new RequiredFieldTypeAdapterFactory())
                    .registerTypeAdapterFactory(new OptionalTypeAdapterFactory())
                    .registerTypeAdapterFactory(new ImmutableListStripUnknownEnumsTypeAdapterFactory());

        }

        public FlylineClient build() {
            if (baseUrl == null) {
                throw new IllegalArgumentException(
                        "must set baseUrl. You probably want to call productionBaseUrl(), developmentBaseUrl(), or sandboxBaseUrl().");
            }


            gsonBuilder.registerTypeAdapterFactory(
                    new CredentialInjectingTypeAdapterFactory());
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .validateEagerly(true)
                    .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                    .client(buildOkHttpClient())
                    .build();

            return new FlylineClient(retrofit.create(FlylineApiService.class), retrofit);
        }

        private OkHttpClient buildOkHttpClient() {
            if (httpLogLevel != null) {
                okHttpClientBuilder.addInterceptor(new HttpLoggingInterceptor().setLevel(httpLogLevel));
            }

            checkRuntimeSupportsTls12(okHttpClientBuilder);

            return okHttpClientBuilder.build();
        }

        private void checkRuntimeSupportsTls12(OkHttpClient.Builder okHttpClientBuilder) {
            SSLSocket testSslSocket = null;

            try {
                // create a temporary client and test socket to check for desired cipher and protocol support
                OkHttpClient testOkHttpClient = okHttpClientBuilder.build();
                testSslSocket = (SSLSocket) testOkHttpClient.sslSocketFactory().createSocket();

                // does the test socket work with our connection spec's cipher suite and tls version as-is?
                if (CONNECTION_SPEC.isCompatible(testSslSocket)) {
                    return; // no further questions!
                }

                // perhaps TLSv1.2 is supported, just not enabled by default (some versions of Java 7)
                if (!Arrays.asList(testSslSocket.getSupportedProtocols())
                        .contains(TlsVersion.TLS_1_2.javaName())) {
                    throw new RuntimeException(
                            "This JRE's SSL implementation does not support TLSv1.2. Bailing out.");
                }

                // supported but not enabled by default. In this case, we'll have our OkHTTP
                // client use an SSLSocketFactory which does enable it.

                // The following SSLSocketFactory setup code is from
                // OkHttpClient.Builder#sslSocketFactory()'s javadocs
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
                        TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:"
                            + Arrays.toString(trustManagers));
                }
                X509TrustManager trustManager = (X509TrustManager) trustManagers[0];

                SSLContext sslContext = SSLContext.getInstance(TlsVersion.TLS_1_2.javaName());
                sslContext.init(null, new TrustManager[] {trustManager}, null);
                SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
                okHttpClientBuilder.sslSocketFactory(sslSocketFactory, trustManager);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            } finally {
                if (testSslSocket != null) {
                    try {
                        testSslSocket.close();
                    } catch (IOException ex) {
                        // oh well
                    }
                }
            }
        }
        public OkHttpClient.Builder okHttpClientBuilder() {
            return okHttpClientBuilder;
        }
        public GsonBuilder gsonBuilder() {
            return gsonBuilder;
        }
        public Builder logLevel(HttpLoggingInterceptor.Level level) {
            this.httpLogLevel = level;
            return this;
        }
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }


    }




}
