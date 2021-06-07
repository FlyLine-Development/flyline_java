package com.flyline.client.model;

import java.util.List;

public class Slice_Segment {
    private String id;
    private String aircraft;
    private String origin;
    private String origin_terminal;
    private String departing_at;
    private String destination;
    private String arriving_at;
    private String distance;
    private String duration;
    private String marketing_carrier;
    private String marketing_carrier_flight_number;
    private List<PassengerResponse> passengers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin_terminal() {
        return origin_terminal;
    }

    public void setOrigin_terminal(String origin_terminal) {
        this.origin_terminal = origin_terminal;
    }

    public String getDeparting_at() {
        return departing_at;
    }

    public void setDeparting_at(String departing_at) {
        this.departing_at = departing_at;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArriving_at() {
        return arriving_at;
    }

    public void setArriving_at(String arriving_at) {
        this.arriving_at = arriving_at;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMarketing_carrier() {
        return marketing_carrier;
    }

    public void setMarketing_carrier(String marketing_carrier) {
        this.marketing_carrier = marketing_carrier;
    }

    public String getMarketing_carrier_flight_number() {
        return marketing_carrier_flight_number;
    }

    public void setMarketing_carrier_flight_number(String marketing_carrier_flight_number) {
        this.marketing_carrier_flight_number = marketing_carrier_flight_number;
    }

    public List<PassengerResponse> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerResponse> passengers) {
        this.passengers = passengers;
    }
}
