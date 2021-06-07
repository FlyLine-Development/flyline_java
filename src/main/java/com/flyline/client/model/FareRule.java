package com.flyline.client.model;

import java.util.List;
import java.util.Map;

public class FareRule {
    private boolean refundable;
    private String cancellation_change_fees;
    private String seat_selection;
    private String boarding_zone;
    private String points_mileage;
    private Map<String, List<String>> ticketing;

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
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
