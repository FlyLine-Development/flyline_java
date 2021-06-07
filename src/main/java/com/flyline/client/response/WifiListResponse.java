package com.flyline.client.response;

import com.flyline.client.model.Wifi;

import java.util.List;
import java.util.Map;

public class WifiListResponse {
    private List<Wifi> data;


    public List<Wifi> getData() {
        return data;
    }

    public void setData(List<Wifi> data) {
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
