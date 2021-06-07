package com.flyline.client.response;

import com.flyline.client.model.Beverage;

import java.util.List;
import java.util.Map;

public class BeverageListResponse {
    private List<Beverage> data;

    public List<Beverage> getData() {
        return data;
    }

    public void setData(List<Beverage> data) {
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
