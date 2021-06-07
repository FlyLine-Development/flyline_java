package com.flyline.client.model;

public class CabinAttributes {
    private Seat seat_attributes;
    private Seat seat_layout;

    public Seat getSeat_attributes() {
        return seat_attributes;
    }

    public void setSeat_attributes(Seat seat_attributes) {
        this.seat_attributes = seat_attributes;
    }

    public Seat getSeat_layout() {
        return seat_layout;
    }

    public void setSeat_layout(Seat seat_layout) {
        this.seat_layout = seat_layout;
    }
}
