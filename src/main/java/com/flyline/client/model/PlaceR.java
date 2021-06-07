package com.flyline.client.model;

public class PlaceR {
    private String airport_code;
    private String city;
    private String country_code;
    private String time_scheduled;
    private String time_expected;
    private String time_actual;
    private String terminal;

    public String getAirport_code() {
        return airport_code;
    }

    public void setAirport_code(String airport_code) {
        this.airport_code = airport_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getTime_scheduled() {
        return time_scheduled;
    }

    public void setTime_scheduled(String time_scheduled) {
        this.time_scheduled = time_scheduled;
    }

    public String getTime_expected() {
        return time_expected;
    }

    public void setTime_expected(String time_expected) {
        this.time_expected = time_expected;
    }

    public String getTime_actual() {
        return time_actual;
    }

    public void setTime_actual(String time_actual) {
        this.time_actual = time_actual;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }
}
