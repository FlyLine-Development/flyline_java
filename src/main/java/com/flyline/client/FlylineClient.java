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

    public String sendRequest(String endPoint, String dataJsonStr) {
        RequestBody requestBody;
        if (dataJsonStr == null) {
            requestBody = null;
        } else {
            requestBody = RequestBody.create(mediaType, dataJsonStr);
        }

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

    public String get_airfares(String dataJsonStr) {
        return sendRequest("/api/flights/shop/", dataJsonStr);
    }

    public String get_airattributes_by_flight_number(String dataJsonStr) {
        return sendRequest("/api/search/amenities/", dataJsonStr);
    }

    public String get_airattributes_by_route(String dataJsonStr) {
        return sendRequest("/api/amenities/search/route", dataJsonStr);
    }

    public String get_schedules_by_flight_number(String dataJsonStr) {
        return sendRequest("/api/schedule-flight", dataJsonStr);
    }

    public String get_schedules_by_route(String dataJsonStr) {
        return sendRequest("/api/schedule/", dataJsonStr);
    }

    public String get_seat_maps(String dataJsonStr) {
        return sendRequest("/api/seat-maps", dataJsonStr);
    }

    public String get_aircrafts() {
        return sendRequest("/api/aircraft/", null);
    }

    public String get_aircraft(String iata_code) {
        return sendRequest("/api/aircraft/" + iata_code + "/", null);
    }

    public String get_airlines() {
        return sendRequest("/api/airlines/", null);
    }

    public String get_airline(String iata_code) {
        return sendRequest("/api/airlines/" + iata_code + "/", null);
    }

    public String get_airports() {
        return sendRequest("/api/airports/", null);
    }

    public String get_airport(String iata_code) {
        return sendRequest("/api/airports/" + iata_code + "/", null);
    }

    public String get_airport_by_city(String iata_code) {
        return sendRequest("/api/cities/" + iata_code + "/airports/", null);
    }

    public String get_cities() {
        return sendRequest("/api/cities", null);
    }

    public String get_city(String iata_code) {
        return sendRequest("/api/cities/" + iata_code + "/", null);
    }

    public String get_cabin_class_mapping(String carrier, String cabin_class) {
        if (carrier != null && cabin_class != null) {
            return sendRequest("/api/cabin-booking?carrier=" + carrier + "&cabin_class" + cabin_class, null);
        } else {
            return sendRequest("/api/cabin-booking/", null);
        }
    }

    public String get_seat_types() {
        return sendRequest("/api/seats/", null);
    }

    public String get_seat_layouts() {
        return sendRequest("/api/layouts/", null);
    }

    public String get_foods() {
        return sendRequest("/api/foods/", null);
    }

    public String get_beverages() {
        return sendRequest("/api/beverages/", null);
    }

    public String get_entertainments() {
        return sendRequest("/api/entertainments/", null);
    }

    public String get_wifis() {
        return sendRequest("/api/wifis/", null);
    }

    public String get_powers() {
        return sendRequest("/api/powers", null);
    }
}
