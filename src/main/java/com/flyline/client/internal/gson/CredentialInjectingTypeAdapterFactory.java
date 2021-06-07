package com.flyline.client.internal.gson;

import com.flyline.client.request.common.BaseClientRequest;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import java.io.IOException;

/**
 * Creates custom {@link TypeAdapter} which inject credentials into request objects
 * during serialization.
 */
public class CredentialInjectingTypeAdapterFactory implements TypeAdapterFactory {

    public CredentialInjectingTypeAdapterFactory() {
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        final TypeAdapter<T> defaultAdapter = gson.getDelegateAdapter(this, type);
        if (BaseClientRequest.class.isAssignableFrom(type.getRawType())) {
            return new TypeAdapter<T>() {
                @Override
                public void write(JsonWriter out, T value) throws IOException {
                    defaultAdapter.write(out, value);
                }
                @Override
                public T read(JsonReader in) throws IOException {
                    return defaultAdapter.read(in);
                }
            };
        } else {
            return null;
        }
    }
}
