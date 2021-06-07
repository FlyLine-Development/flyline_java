package com.flyline.client.response;

import com.flyline.client.model.Aircraft;
import com.flyline.client.model.Airport;
import com.flyline.client.model.Carrier;
import com.flyline.client.model.Offer;

import java.util.List;

public class AirfareResponse {
    private boolean live_mode;
    private int count;
    private List<Airport> airports;
    private List<Aircraft> aircraft;
    private List<Carrier> carriers;
    private List<Offer> offers;
}
