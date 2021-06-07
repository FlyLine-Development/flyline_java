package com.flyline.client.response;

import com.flyline.client.model.Aircraft;
import com.flyline.client.model.Airline;

import java.util.List;
import java.util.Map;

public class AirlineListResponse {
    private List<Airline> data;

    public List<Airline> getData() {
        return data;
    }

    public void setData(List<Airline> data) {
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
