package com.flyline.client.request;

import com.flyline.client.model.PassengerRequest;
import com.flyline.client.model.Slice;
import com.flyline.client.request.common.BaseClientRequest;

import java.util.Date;
import java.util.List;

public class GetAirAttributeRequest extends BaseClientRequest {
    private String cabin_class;
    private Options options;
    public GetAirAttributeRequest(String _cabin_class){
        this.cabin_class = _cabin_class;
    }

    public GetAirAttributeRequest withParams(String departure, String arrival, Date departure_date, String flight_no, String carrier){
        if(this.options == null){
            this.options = new Options();
        }
        this.options.departure = departure;
        this.options.arrival = arrival;
        this.options.departure_date = departure_date;
        this.options.flight_no = flight_no;
        this.options.carrier = carrier;
        return this;
    }

    public GetAirAttributeRequest withRoute(List<Slice> slices, List<PassengerRequest> passengers){
        if(this.options == null){
            this.options = new Options();
        }

        this.options.slices = slices;
        this.options.passengers = passengers;
        return this;
    }



    private static class Options{
        private List<Slice> slices;
        private List<PassengerRequest> passengers;

        private String departure;
        private String arrival;
        private Date departure_date;
        private String flight_no;
        private String carrier;
    }

}
