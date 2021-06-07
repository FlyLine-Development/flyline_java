package com.flyline.client.response;

import com.flyline.client.model.Entertainment;

import java.util.List;
import java.util.Map;

public class EntertainmentListResponse {
    private List<Entertainment> data;

    public List<Entertainment> getData() {
        return data;
    }

    public void setData(List<Entertainment> data) {
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
