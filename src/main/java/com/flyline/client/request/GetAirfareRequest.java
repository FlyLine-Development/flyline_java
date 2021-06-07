package com.flyline.client.request;

import com.flyline.client.model.PassengerRequest;
import com.flyline.client.model.PermittedTime;
import com.flyline.client.model.Slice;
import com.flyline.client.request.common.BaseClientRequest;

import java.util.List;
import java.util.Map;

public class GetAirfareRequest extends BaseClientRequest {
    private String cabin_class;
    private Options options;

    public GetAirfareRequest(String _cabin_class){
        cabin_class = _cabin_class;
    }

    public GetAirfareRequest withOneWay(List<Slice> slices, List<PassengerRequest> passengers){
        if(this.options == null){
            this.options = new Options();
        }
        if(slices.size() != 1){
           return null;
        }
        this.options.slices = slices;
        this.options.passengers = passengers;

        return this;
    }

    public GetAirfareRequest withRouteWay(List<Slice> slices, List<PassengerRequest> passengers){
        if(this.options == null){
            this.options = new Options();
        }
        if(slices.size() != 2){
            return null;
        }
        this.options.slices = slices;
        this.options.passengers = passengers;

        return this;
    }

    public GetAirfareRequest withFares(List<Slice> slices, List<PassengerRequest> passengers, List<String> permitted_carriers){
        if(this.options == null){
            this.options = new Options();
        }
        this.options.slices = slices;
        this.options.passengers = passengers;
        this.options.permitted_carriers = permitted_carriers;
        return this;
    }

    public GetAirfareRequest withMaxPrices(List<Slice> slices, List<PassengerRequest> passengers, Map<String, String> maxPrices){
        if(this.options == null){
            this.options = new Options();
        }
        this.options.slices = slices;
        this.options.passengers = passengers;
        this.options.maxPrices = maxPrices;
        return this;
    }

    public GetAirfareRequest withCarriers(List<Slice> slices, List<PassengerRequest> passengers, List<String> permitted_carriers){
        if(this.options == null){
            this.options = new Options();
        }
        this.options.slices = slices;
        this.options.passengers = passengers;
        this.options.permitted_carriers= permitted_carriers;
        return this;
    }

    public GetAirfareRequest withFlightNumbers(List<Slice> slices, List<PassengerRequest> passengers, List<String> flightNumbers){
        if(this.options == null) {
            this.options = new Options();
        }

        for (Slice slice : slices) {
            if (slice.getFlight_numbers() != flightNumbers || slice.getFlight_numbers() == null) {
                slice.setFlight_numbers(flightNumbers);
            }
        }

        this.options.slices = slices;
        this.options.passengers = passengers;
        return this;
    }

    public GetAirfareRequest withArrivalTimes(List<Slice> slices, List<PassengerRequest> passengers, List<PermittedTime> permittedTimes){
        if(this.options == null){
            this.options = new Options();
        }
        for (Slice slice : slices) {
            if (slice.getArrival().getPermittedTime() == permittedTimes) {
                slice.getArrival().setPermittedTime(permittedTimes);
            }
        }
        this.options.slices = slices;
        this.options.passengers = passengers;
        return this;
    }

    public GetAirfareRequest withDepartureTimes(List<Slice> slices, List<PassengerRequest> passengers, List<PermittedTime> permittedTimes){
        if(this.options == null){
            this.options = new Options();
        }
        for (Slice slice : slices) {
            if (slice.getDeparture().getPermittedTime() == permittedTimes) {
                slice.getDeparture().setPermittedTime(permittedTimes);
            }
        }
        this.options.slices = slices;
        this.options.passengers = passengers;
        return this;
    }

    public GetAirfareRequest withPermittedCarriers(List<Slice> slices, List<PassengerRequest> passengers, List<String> permittedCarriers){
        if(this.options == null){
            this.options = new Options();
        }

        this.options.permitted_carriers = permittedCarriers;
        this.options.slices = slices;
        this.options.passengers = passengers;
        return this;
    }

    private static class Options{
        private List<Slice> slices;
        private List<PassengerRequest> passengers;
        private List<String> permitted_carriers;
        private Map<String,String> maxPrices;
    }
}
