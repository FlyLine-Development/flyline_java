package com.flyline.client;

import com.flyline.client.request.*;
import com.flyline.client.response.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface FlylineApiService {
    // GetSeatList API
    @GET("/seats")
    Call<SeatResponse> getSeatList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/layouts")
    Call<SeatResponse> getLayoutList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/foods")
    Call<FoodListResponse> getFoodList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/beverages")
    Call<BeverageListResponse> getBeverageList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/entertainments")
    Call<EntertainmentListResponse> getEntertainmentList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/wifis")
    Call<WifiListResponse> getWifiList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/powers")
    Call<PowerListResponse> getPowerList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/aircraft")
    Call<AircraftListResponse> getAircraftList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/aircraft/{aircraftIataCode}")
    Call<AircraftResponse> getAirCraftByIataCode(@Header("Authorization") String f_Token, @Path ("aircraftIataCode") String aircraftIataCode);

    // GetSeatList API
    @GET("/airlines")
    Call<AirlineListResponse> getAirlineList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/airlines/{airlineIataCode}")
    Call<AirlineResponse> getAirlineByIataCode(@Header("Authorization") String f_Token, @Path("airlineIataCode") String airlineIataCode);

    // GetSeatList API
    @GET("/airports")
    Call<AirportListResponse> getAirportList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/airports/{airportIataCode}")
    Call<AirportResponse> getAirportByIataCode(@Header("Authorization") String f_Token, @Path("airportIataCode") String airportIataCode);

    // GetSeatList API
    @GET("/airports/{cityIataCode}/airports")
    Call<AirportResponse> getAirportByCity(@Header("Authorization") String f_Token, @Path("cityIataCode") String cityIataCode);

    // GetSeatList API
    @GET("/cities")
    Call<CityListResponse> getCityList(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/cities/{cityIataCode}")
    Call<CityResponse> getCityByIataCode(@Header("Authorization") String f_Token, @Path("cityIataCode") String cityIataCode);

    // GetSeatList API
    @GET("/cabin-booking")
    Call<CabinListResponse> getCabinMapping(@Header("Authorization") String f_Token);

    // GetSeatList API
    @GET("/cabin-booking")
    Call<CabinListResponse> getCabinMapingWithParams(@Header("Authorization") String f_Token, @Query("carrier") String carrier, @Query("cabin_class") String cabin_class);

    @Headers({"Content-Type:application/json"})
    @POST("/search/amenities")
    Call<AirAttributeResponse> getAirAttributeWithParams(@Header("Authorization") String f_Token, @Body GetAirAttributeRequest request);

    @POST("/amenities/search/route")
    Call<AirAttributeResponse> getAirAttributeByRoute(@Header("Authorization") String f_Token, @Body GetAirAttributeRequest request);

    @POST("/flights/shop")
    Call<AirfareResponse> getAirfareWithParams(@Header("Authorization") String f_Token, @Body GetAirfareRequest request);

    @POST("/schedule-flight")
    Call<AirScheduleResponse> getAirScheduleWithParam(@Header("Authorization") String f_Token, @Body GetAirScheduleRequest request);

    @POST("/schedule")
    Call<AirScheduleResponse> getAirScheduleByRoute(@Header("Authorization") String f_Token, @Body GetAirScheduleRequest request);

    @POST("/schedule")
    Call<SeatMapResponse> getSeatMap(@Header("Authorization") String f_Token, @Body GetSeatMapRequest request);

}
