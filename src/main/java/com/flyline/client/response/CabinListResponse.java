package com.flyline.client.response;

import com.flyline.client.model.Cabin;

import java.util.List;
import java.util.Map;

public class CabinListResponse {
    private List<Map<String, List<Cabin>>> data;

    public List<Map<String, List<Cabin>>> getData() {
        return data;
    }

    public void setData(List<Map<String, List<Cabin>>> data) {
        this.data = data;
    }
}
