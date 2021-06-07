package com.flyline.client.model;

import java.util.List;

public class FareSegment {
    private String segment_id;
    private CabinAmenities cabin_amenities;
    private CabinAttributes cabin_attributes;

    public String getSegment_id() {
        return segment_id;
    }

    public void setSegment_id(String segment_id) {
        this.segment_id = segment_id;
    }

    public CabinAmenities getCabin_amenities() {
        return cabin_amenities;
    }

    public void setCabin_amenities(CabinAmenities cabin_amenities) {
        this.cabin_amenities = cabin_amenities;
    }

    public CabinAttributes getCabin_attributes() {
        return cabin_attributes;
    }

    public void setCabin_attributes(CabinAttributes cabin_attributes) {
        this.cabin_attributes = cabin_attributes;
    }
}
