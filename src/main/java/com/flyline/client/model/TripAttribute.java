package com.flyline.client.model;

import java.util.List;

public class TripAttribute {
    private String carrier;
    private List<SliceR> slices;
    private FareAttribute fare_attributes;

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public List<SliceR> getSlices() {
        return slices;
    }

    public void setSlices(List<SliceR> slices) {
        this.slices = slices;
    }

    public FareAttribute getFare_attributes() {
        return fare_attributes;
    }

    public void setFare_attributes(FareAttribute fare_attributes) {
        this.fare_attributes = fare_attributes;
    }
}
