package org.utils;

public class ApiConstants {

    public static final String TripId = "188125";
    public static final String PnrNumber = "5RCAFSBP4NG7";
    public static final String INTERNAL_TRIPS = "/v1/trips/internal-trips";
    public static final String EDIT_TRIPS = "/v1/trips/trips/"+TripId;
    public static final String VEHICLE_SEARCH = "/v1/inventory/vehicle";
    public static final String TRIP_CONFLICT_BOOKINGS = "/v1/bookings/trip-booking-cancel/"+TripId;
    public static final String PNR_DETAILS = "/v1/bookings/"+PnrNumber+"/";

    public static final String ACCEPT_JSON = "application/json";
    public static final String USER_TYPE_INTERNAL = "internal";
    public static final String PLATFORM_INTR = "INTR";
}
