package com.flyline.client;

import okhttp3.*;

import java.io.IOException;
import java.util.logging.Logger;


public final class FlylineClient {
    private final String f_token;
    private OkHttpClient okHttpClient;
    private MediaType mediaType;
    private final String BASE_URL = "https://api.flyline.io";
    private static final String TAG = FlylineClient.class.getSimpleName();
    Request request;


    private RequestBody requestBody;

    public FlylineClient(String FToken) {
        super();
        this.f_token = FToken;
        okHttpClient = new OkHttpClient().newBuilder().build();
        mediaType = MediaType.parse("application/json");
    }

    public String sendPostRequest(String endPoint, String dataJsonStr) {
        RequestBody requestBody;
        requestBody = RequestBody.create(mediaType, dataJsonStr);
        request = new Request.Builder()
                .url(BASE_URL + endPoint)
                .method("POST", requestBody)
                .addHeader("Authorization", "FToken " + f_token)
                .addHeader("Content-Type", "application/json")
                .build();
        final String[] response_data = new String[1];
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Error: " + response);
                } else {
                    System.out.print("Request Success");
                }

                response_data[0] = response.body().toString();

            }

        });
        return response_data[0];
    }

    public String sendGetRequest(String endPoint) {
        request = new Request.Builder()
                .url(BASE_URL + endPoint)
                .method("GET", null)
                .addHeader("Authorization", "FToken " + f_token)
                .addHeader("Content-Type", "application/json")
                .build();
        final String[] response_data = new String[1];
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Error: " + response);
                } else {
                    System.out.print("Request Success");
                }

                response_data[0] = response.body().toString();

            }

        });
        return response_data[0];
    }

    public String getAirfares(String dataJsonStr) {
        return sendPostRequest("/api/flights/shop/", dataJsonStr);
    }

    public String getAirAttributesByFlightNumber(String dataJsonStr) {
        return sendPostRequest("/search/attributes/flight/", dataJsonStr);
    }

    public String getAirAttributesByRoute(String dataJsonStr) {
        return sendPostRequest("/search/attributes/route/", dataJsonStr);
    }

    public String getSchedulesByFlightNumber(String dataJsonStr) {
        return sendPostRequest("/api/schedule-flight", dataJsonStr);
    }

    public String getSchedulesByRoute(String dataJsonStr) {
        return sendPostRequest("/api/schedule/", dataJsonStr);
    }

    public String getSeatMaps(String dataJsonStr) {
        return sendPostRequest("/api/seat-maps", dataJsonStr);
    }

    public String getAircrafts() {
        return sendGetRequest("/api/aircraft/");
    }

    public String getAircraft(String iata_code) {
        return sendGetRequest("/api/aircraft/" + iata_code + "/");
    }

    public String getAirlines() {
        return sendGetRequest("/api/airlines/");
    }

    public String getAirline(String iata_code) {
        return sendGetRequest("/api/airlines/" + iata_code + "/");
    }

    public String getAirports() {
        return sendGetRequest("/api/airports/");
    }

    public String getAirport(String iata_code) {
        return sendGetRequest("/api/airports/" + iata_code + "/");
    }

    public String getAirportByCity(String iata_code) {
        return sendGetRequest("/api/cities/" + iata_code + "/airports/");
    }

    public String getCities() {
        return sendGetRequest("/api/cities");
    }

    public String getCity(String iata_code) {
        return sendGetRequest("/api/cities/" + iata_code + "/");
    }

    public String getCabinClassMapping(String carrier, String cabin_class) {
        if (carrier != null && cabin_class != null) {
            return sendGetRequest("/api/cabin-booking?carrier=" + carrier + "&cabin_class" + cabin_class);
        } else {
            return sendGetRequest("/api/cabin-booking/");
        }
    }

    public String getSeatTypes() {
        return sendGetRequest("/api/seats/");
    }

    public String getSeatLayouts() {
        return sendGetRequest("/api/layouts/");
    }

    public String getFoods() {
        return sendGetRequest("/api/foods/");
    }

    public String getBeverages() {
        return sendGetRequest("/api/beverages/");
    }

    public String getEntertainments() {
        return sendGetRequest("/api/entertainments/");
    }

    public String getWifis() {
        return sendGetRequest("/api/wifis/");
    }

    public String getPowers() {
        return sendGetRequest("/api/powers");
    }
}
