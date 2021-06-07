package com.flyline.client.model;

import java.util.List;
import java.util.Objects;

public class Slice {
    private Place departure;
    private Place arrival;
    private List<String> flight_numbers;


    public Place getDeparture(){
        return departure;
    }

    public Place getArrival(){
        return arrival;
    }

    public void setDeparture(Place _departure){
        this.departure = _departure;
    }

    public void setArrival(Place _arrival){
        this.arrival = _arrival;
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Slice that = (Slice) other;
        return Objects.equals(departure, that.getDeparture()) &&
                Objects.equals(arrival, that.getArrival());
    }

    public List<String> getFlight_numbers() {
        return flight_numbers;
    }

    public void setFlight_numbers(List<String> flight_numbers) {
        this.flight_numbers = flight_numbers;
    }
}
