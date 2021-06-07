package com.flyline.client.response;

import com.flyline.client.model.Aircraft;
import com.flyline.client.model.Airline;

public class AirlineResponse {
    private Airline data;

    public Airline getData() {
        return data;
    }

    public void setData(Airline data) {
        this.data = data;
    }
}
