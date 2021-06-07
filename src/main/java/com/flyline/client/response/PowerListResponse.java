package com.flyline.client.response;

import com.flyline.client.model.Power;

import java.util.List;
import java.util.Map;

public class PowerListResponse {
    private List<Power> data;

    public List<Power> getData() {
        return data;
    }

    public void setData(List<Power> data) {
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
