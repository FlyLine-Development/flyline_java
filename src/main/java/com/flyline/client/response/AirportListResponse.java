package com.flyline.client.response;

import com.flyline.client.model.Airline;
import com.flyline.client.model.Airport;

import java.util.List;
import java.util.Map;

public class AirportListResponse {
    private List<Airport> data;

    public List<Airport> getData() {
        return data;
    }

    public void setData(List<Airport> data) {
        this.data = data;
    }

    private List<Map<String, String>> meta;

    public List<Map<String, String>> getMeta() {
        return meta;
    }

    public void setMeta(List<Map<String, String>> meta) {
        this.meta = meta;
    }
}
