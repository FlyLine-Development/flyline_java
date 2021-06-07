package com.flyline.client.model;

public class FareAttribute {
    private String baggage_rules;
    private String cancellation_change_fees;
    private String seat_selection;
    private String boarding_zone;
    private String points_mileage;

    public String getBaggage_rules() {
        return baggage_rules;
    }

    public void setBaggage_rules(String baggage_rules) {
        this.baggage_rules = baggage_rules;
    }

    public String getCancellation_change_fees() {
        return cancellation_change_fees;
    }

    public void setCancellation_change_fees(String cancellation_change_fees) {
        this.cancellation_change_fees = cancellation_change_fees;
    }

    public String getSeat_selection() {
        return seat_selection;
    }

    public void setSeat_selection(String seat_selection) {
        this.seat_selection = seat_selection;
    }

    public String getBoarding_zone() {
        return boarding_zone;
    }

    public void setBoarding_zone(String boarding_zone) {
        this.boarding_zone = boarding_zone;
    }

    public String getPoints_mileage() {
        return points_mileage;
    }

    public void setPoints_mileage(String points_mileage) {
        this.points_mileage = points_mileage;
    }
}
