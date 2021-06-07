package com.flyline.client.response;

import com.flyline.client.model.Airline;
import com.flyline.client.model.Airport;

public class AirportResponse {
    private Airport data;

    public Airport getData() {
        return data;
    }

    public void setData(Airport data) {
        this.data = data;
    }
}
