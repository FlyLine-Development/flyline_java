package com.flyline.client.request;

import com.flyline.client.request.common.BaseClientRequest;

public class GetSeatMapRequest extends BaseClientRequest {
    private String carrier;
    private String aircraft;
    public GetSeatMapRequest(String carrier, String aircraft){
        this.carrier = carrier;
        this.aircraft = aircraft;
    }


}
