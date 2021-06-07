package com.flyline.client.model;

import java.util.List;

public class Offer {
    private String id;
    private String base_amount;
    private String base_currency;
    private String tax_amount;
    private String tax_currency;
    private String total_amount;
    private List<PassengerResponse> passengers;
    private String owner;
    private List<SliceR> slices;
    private List<Fare> fares;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBase_amount() {
        return base_amount;
    }

    public void setBase_amount(String base_amount) {
        this.base_amount = base_amount;
    }

    public String getBase_currency() {
        return base_currency;
    }

    public void setBase_currency(String base_currency) {
        this.base_currency = base_currency;
    }

    public String getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(String tax_amount) {
        this.tax_amount = tax_amount;
    }

    public String getTax_currency() {
        return tax_currency;
    }

    public void setTax_currency(String tax_currency) {
        this.tax_currency = tax_currency;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public List<PassengerResponse> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerResponse> passengers) {
        this.passengers = passengers;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<SliceR> getSlices() {
        return slices;
    }

    public void setSlices(List<SliceR> slices) {
        this.slices = slices;
    }

    public List<Fare> getFares() {
        return fares;
    }

    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }
}
