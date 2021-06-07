package com.flyline.client.request;

import com.flyline.client.request.common.BaseClientRequest;

import java.util.Date;

public class GetAirScheduleRequest extends BaseClientRequest {
    private String airline;
    private Date date;
    private Options options;
    public GetAirScheduleRequest(String _airline, Date _date){
        this.airline = _airline;
        this.date = _date;
    }

    public GetAirScheduleRequest withFlightNumber(String flightNumber){
        if(this.options == null){
            this.options = new Options();
        }
        this.options.flight_number = flightNumber;
        return this;
    }

    public GetAirScheduleRequest withRoute(String origin, Date date){
        if(this.options == null){
            this.options = new Options();
        }

        this.options.origin = origin;
        this.options.date = date;
        return this;
    }

    private static class Options{
        String flight_number;
        String origin;
        Date date;
    }

}
