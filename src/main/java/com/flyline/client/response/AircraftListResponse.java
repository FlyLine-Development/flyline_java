package com.flyline.client.response;

import com.flyline.client.model.Aircraft;

import java.util.List;
import java.util.Map;

public class AircraftListResponse {
    private List<Aircraft> data;

    public List<Aircraft> getData() {
        return data;
    }

    public void setData(List<Aircraft> data) {
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
