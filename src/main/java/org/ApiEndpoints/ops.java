package org.ApiEndpoints;

public class ops {

    public static final String DRIVER = "/v1/bus/opsStaff/d";
    public static final String CAPTAIN = "/v1/bus/opsStaff/c";
    public static final String GROUND_OPS = "/v1/bus/opsStaff/g";
    public static final String GROUND_TRIPS = "/v1/trips/ground-trips";
    public static final String PARTNER_PNR = "/v1/trips/partner-pnr";
    public static final String  GROUND_VEHICLE= "/v1/inventory/get-ground-vehicle";
    public static final String TRIPS_HOP = "/v1/trips/ground-trips";
    public static final String FEEDER_SERVICE = "/v1/trips/ground-trips";
    public static final String CENTRAL_SERVICE = "/v1/trips/ground-trips";

    public static  String PASSENGER_LIST(String TripId){
        return "/v1/bookings/passenger-list/"+ TripId;
    }







}
