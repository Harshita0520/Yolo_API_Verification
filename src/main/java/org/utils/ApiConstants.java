package org.utils;

public class ApiConstants {

    /* API ENDPOINTS */
    public static final String INTERNAL_TRIPS = "/v1/trips/internal-trips";
    public static final String VEHICLE_SEARCH = "/v1/inventory/vehicle";
    public static final String SERVICE_TEMPLATES = "/v1/inventory/service_templates_details";
    public static final String HOPS_SEARCH = "/v1/inventory/hops";
    public static final String SERVICE_FARES = "/v1/inventory/service_fares";
    public static final String COACH_SEARCH = "/v1/inventory/coaches";
    public static final String CITY_SEARCH = "/v1/inventory/cities";
    public static final String ROUTE_SEARCH = "/v1/inventory/routes";
    public static final String ALL_VEHICLES = "/v1/inventory/allvehicles";
    public static final String ALL_AMENITIES = "/v1/inventory/all_amenities/";
    public static final String USER_BOOKINGS = "/v1/bookings/";
    public static final String SME_RATINGS = "/v1/ratings/sme_ratings";
    public static final String CONVENIENCE_FEES = "/v1/bookings/get-conveniencefees";
    public static final String SEARCH_CITY = "/v1/bus/city";
    public static final String BUS_STAFF = "/v1/bus/staff";




    public static String EDIT_TRIPS(String TripId) {
        return "/v1/trips/trips/"+TripId;
    }

    public static String TRIP_CONFLICT_BOOKINGS(String TripId) {
        return "/v1/bookings/trip-booking-cancel/"+TripId;
    }

    public static String PNR_DETAILS (String PnrNumber){
        return "/v1/bookings/"+PnrNumber+"/";
    }

    public static String TRIP_DETAILS(String tripId, String subTripId) {
        return "/v1/trips/trips/" + tripId + "/subtrips/" + subTripId + "/details";
    }

    public static String TRIP_SUGGESTIONS(String BookingId) {
        return "/v1/bookings/get-trip-suggestions/" + BookingId;
    }

    public static String EDIT_BOOKINGS(String TripId) {
        return "/v1/bookings/trips/"+TripId;
    }

    public static String BOOKING_DETAILS(String BookingId) {
        return "/v1/bookings/"+BookingId+"/";
    }

    public static String SERVICE_DETAILS(String ServiceId){
        return "/v1/inventory/service_templates/"+ServiceId;
    }

    public static String COACH_LAYOUT(String CoachId){
        return "/v1/inventory/coaches/"+CoachId;
    }

    public static String HOP_DETAILS(String HopId){
        return "/v1/inventory/hops/"+HopId;
    }

    public static String CITY_DETAILS(String CityId){
        return "/v1/inventory/cities/"+CityId;
    }
    public static String ROUTE_DETAILS(String RouteId){
        return "/v1/inventory/routes/"+RouteId;
    }

    public static String TRIP_DETAILS_V2(String tripId, String subTripId){
        return "/v1/trips/trips/"+tripId+"/subtrips/"+subTripId+"/details_v2";
    }
    public static String PARTIAL_BOOKING(String BookingId){
        return "/v1/bookings/partials/"+BookingId;
    }

    public static String USER_WALLET(String UserId){
        return "/v1/wallets/"+UserId;
    }

    public static String WALLET_TRANSACTIONS(String UserId){
        return "/v1/wallets/"+UserId+"/transactions";
    }






    /* API HEADERS */

    public static final String ACCEPT_JSON = "application/json";
    public static final String USER_TYPE_INTERNAL = "internal";
    public static final String PLATFORM_INTR = "INTR";
}
