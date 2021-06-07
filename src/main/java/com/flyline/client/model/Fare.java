package com.flyline.client.model;

import java.util.List;

public class Fare {
    private String cabin_class;
    private String cabin_name;
    private String fare_class;
    private String fare_name;
    private String fare_basic_code;
    private String fare_type;
    private FareRule fare_rules;
    private List<FareSegment> segments;
    private List<PassengerResponse> passengers;
    private String expires_at;
    private String ticket_time_limit;
    private int max_connections;

    public String getCabin_class() {
        return cabin_class;
    }

    public void setCabin_class(String cabin_class) {
        this.cabin_class = cabin_class;
    }

    public String getCabin_name() {
        return cabin_name;
    }

    public void setCabin_name(String cabin_name) {
        this.cabin_name = cabin_name;
    }

    public String getFare_class() {
        return fare_class;
    }

    public void setFare_class(String fare_class) {
        this.fare_class = fare_class;
    }

    public String getFare_name() {
        return fare_name;
    }

    public void setFare_name(String fare_name) {
        this.fare_name = fare_name;
    }

    public String getFare_basic_code() {
        return fare_basic_code;
    }

    public void setFare_basic_code(String fare_basic_code) {
        this.fare_basic_code = fare_basic_code;
    }

    public String getFare_type() {
        return fare_type;
    }

    public void setFare_type(String fare_type) {
        this.fare_type = fare_type;
    }

    public FareRule getFare_rules() {
        return fare_rules;
    }

    public void setFare_rules(FareRule fare_rules) {
        this.fare_rules = fare_rules;
    }

    public List<FareSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<FareSegment> segments) {
        this.segments = segments;
    }

    public List<PassengerResponse> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerResponse> passengers) {
        this.passengers = passengers;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public String getTicket_time_limit() {
        return ticket_time_limit;
    }

    public void setTicket_time_limit(String ticket_time_limit) {
        this.ticket_time_limit = ticket_time_limit;
    }

    public int getMax_connections() {
        return max_connections;
    }

    public void setMax_connections(int max_connections) {
        this.max_connections = max_connections;
    }
}
