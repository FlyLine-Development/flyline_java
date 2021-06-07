package com.flyline.client.response;

import com.flyline.client.model.City;

import java.util.List;
import java.util.Map;

public class CityListResponse {
    private List<City> data;

    public List<City> getData() {
        return data;
    }

    public void setData(List<City> data) {
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
