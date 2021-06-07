package com.flyline.client.response;

import com.flyline.client.model.SeatMap;
import com.flyline.client.model.SeatR;

import java.util.List;

public class SeatMapResponse {
    private List<SeatMap> data;

    public List<SeatMap> getData() {
        return data;
    }

    public void setData(List<SeatMap> data) {
        this.data = data;
    }
}
