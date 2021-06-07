package com.flyline.client.model;

public class Power {
    private String display_text;
    private String multiple_at_seat;
    private String usb_port;
    private String power_outlet;

    public String getDisplay_text() {
        return display_text;
    }

    public void setDisplay_text(String display_text) {
        this.display_text = display_text;
    }

    public String getMultiple_at_seat() {
        return multiple_at_seat;
    }

    public void setMultiple_at_seat(String multiple_at_seat) {
        this.multiple_at_seat = multiple_at_seat;
    }

    public String getUsb_port() {
        return usb_port;
    }

    public void setUsb_port(String usb_port) {
        this.usb_port = usb_port;
    }

    public String getPower_outlet() {
        return power_outlet;
    }

    public void setPower_outlet(String power_outlet) {
        this.power_outlet = power_outlet;
    }
}
