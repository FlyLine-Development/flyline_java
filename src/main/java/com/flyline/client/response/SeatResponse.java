package com.flyline.client.response;

import com.flyline.client.model.Seat;
import com.flyline.client.response.common.BaseResponse;

import java.util.List;
import java.util.Map;

public class SeatResponse extends BaseResponse {

    private List<Seat> data;

    public List<Seat> getSeats() {
        return data;
    }

    public void setSeats(List<Seat> datas) {
        this.data = datas;
    }

    private List<Map<String, String>> meta;

    public List<Map<String, String>> getMeta() {
        return meta;
    }

    public void setMeta(List<Map<String, String>> meta) {
        this.meta = meta;
    }
}
