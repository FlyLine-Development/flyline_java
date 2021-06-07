package com.flyline.client.model;

public class City {
    private String iata_code;
    private String name;
    private String iata_country_code;
    private double longitude;
    private double latitude;
    private String time_zone;

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIata_country_code() {
        return iata_country_code;
    }

    public void setIata_country_code(String iata_country_code) {
        this.iata_country_code = iata_country_code;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }
}
