package com.flyline.client.response;

import com.flyline.client.model.Aircraft;
import com.flyline.client.model.Airport;
import com.flyline.client.model.Carrier;
import com.flyline.client.model.FareAttribute;

import java.util.List;

public class AirAttributeResponse {
    private String cabin_class;
    private List<Carrier> carriers;
    private List<Airport> airports;
    private List<Aircraft> aircraft;
    private FareAttribute fare_attributes;

    public String getCabin_class() {
        return cabin_class;
    }

    public void setCabin_class(String cabin_class) {
        this.cabin_class = cabin_class;
    }

    public List<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public FareAttribute getFare_attributes() {
        return fare_attributes;
    }

    public void setFare_attributes(FareAttribute fare_attributes) {
        this.fare_attributes = fare_attributes;
    }
}
