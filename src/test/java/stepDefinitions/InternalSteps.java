package stepDefinitions;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.Internal.search.*;
import org.Internal.payment.*;
import org.Internal.gds.*;

import java.util.List;
import java.util.Map;


public class InternalSteps {

    private final ScenarioContext scenarioContext;

    public InternalSteps(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }


    @When("I call the Internal Trips API")
    public void i_call_the_internal_trips_api() {
        scenarioContext.setResponse(InternalTripsApi.getInternalTrips());
    }

    @When("I call the Edit Trips API for Trip Id {string}")
    public void i_call_the_edit_trips_api(String TripId) {
        scenarioContext.setResponse(EditTripApi.getTripDetails(TripId));
    }

    @When("I call the Vehicle ops API with vehicle number {string} and status {string}")
    public void i_call_the_vehicle_search_api(String vehicleNumber, String status) {
        scenarioContext.setResponse(VehicleSearchApi.getVehicle(vehicleNumber,status));
    }

    @When("I call the Trip Conflict Bookings API for Trip Id {string} with {string} Details")
    public void i_call_the_trip_conflict_bookings_api(String TripId, String details) {
        Response response = TripConflictBookingApi.getConflictBookings(TripId,details);
        scenarioContext.setResponse(response);  // store for later steps
        System.out.println("✅ API called successfully");
    }
    @Then("booking_count should match the number of bookings in booking_list")
    public void verify_booking_count_matches_list() {
        Response response = scenarioContext.getResponse();  // retrieve stored response
        JsonPath json = response.jsonPath();

        int bookingCount = json.getInt("data.booking_count");
        List<Map<String, Object>> bookingList = json.getList("data.booking_list");

        if (bookingCount != bookingList.size()) {
            throw new AssertionError("booking_count (" + bookingCount +
                    ") does not match size of booking_list (" + bookingList.size() + ")");
        }

        System.out.println("✅ booking_count matches the booking_list size: " + bookingCount);
    }

    @When("I call the PNR Details API for a given PNR number {string}")
    public void i_call_the_pnr_details_api(String pnrNumber) {
        scenarioContext.setResponse(PnrDetailsApi.getPnrDetails(pnrNumber));
    }

    @When("I call the Trip Details API with Trip Id {string} , Sub Trip Id {string} and Date of Journey {string}")
    public void i_call_the_trip_details_api_with_trip_id_sub_trip_id_and_date_of_journey(String string, String string2, String string3) {
        scenarioContext.setResponse(TripDetailsApi.getTripDetails(string,string2,string3));
    }

    @When("I call the Trip Suggestion API with Booking Id {string}")
    public void i_call_the_trip_suggestion_api_with_booking_id(String string) {
        scenarioContext.setResponse(TripSuggestionsApi.getTripSuggestion(string));
    }

    @When("I call the Edit Bookings API with Trip Id {string}")
    public void i_call_the_edit_bookings_api_with_trip_id(String string) {
        scenarioContext.setResponse(EditBookingsApi.getTripBookings(string));
    }

    @When("I call the Booking Details API with Booking Id {string}")
    public void i_call_the_booking_details_api_with_booking_id(String string) {
       scenarioContext.setResponse(BookingDetailsApi.getBookingsDetails(string));
    }

    @When("I call the Service Template API For From City {string}, To City {string} With Service Id {string}")
    public void i_call_the_service_template_api_for_from_city_to_city_with_service_id(String string, String string2, String string3) {
       scenarioContext.setResponse(ServiceTemplatesApi.getServiceTemplates(string,string2,string3));
    }

    @When("I call the Service Details API with Service Id {string}")
    public void i_call_the_service_details_api_with_service_id(String string) {
        scenarioContext.setResponse(ServiceDetailsApi.getServiceDetails(string));
    }

    @When("I call the Hop ops API For City {string} and Hop Name {string}")
    public void i_call_the_hop_search_api_for_city_and_hop_name(String string, String string2) {
        scenarioContext.setResponse(HopSearchApi.getHops(string,string2));
    }

    @When("I call the Coach Layout API For Coach Id {string} and Status {string}")
    public void i_call_the_coach_layout_api_for_coach_id_and_status(String string, String string2) {
        scenarioContext.setResponse(CoachLayoutApi.getCoachLayout(string,string2));
    }

    @When("I call the Service Fare API For From City {string}, To City {string} With Service Id {string}")
    public void i_call_the_service_fare_api_for_from_city_to_city_with_service_id(String string, String string2, String string3) {
        scenarioContext.setResponse(ServiceFaresApi.getServiceFares(string,string2,string3));
    }

    @When("I call the Coach ops API For Coach Name {string}")
    public void i_call_the_coach_search_api_for_coach_name(String string) {
        scenarioContext.setResponse(CoachSearchApi.getCoach(string));
    }

    @When("I call the Hop Details API For Hop Id {string}")
    public void i_call_the_hop_details_api_for_hop_id(String string) {
      scenarioContext.setResponse(HopDetailsApi.getHopDetails(string));
    }

    @When("I call the City ops API For City {string}")
    public void i_call_the_city_search_api_for_city(String string) {
        scenarioContext.setResponse(CitySearchApi.getCity(string));
    }

    @When("I call the City Details API For City Id {string}")
    public void i_call_the_city_details_api_for_city_id(String string) {
        scenarioContext.setResponse(CityDetailsApi.getCityDetails(string));
    }

    @When("I call the Route ops API For City {string}")
    public void i_call_the_route_search_api_for_city(String string) {
        scenarioContext.setResponse(RouteSearchApi.getRoute(string));
    }

    @When("I call the Route Details API For City Id {string}")
    public void i_call_the_route_details_api_for_city_id(String string) {
        scenarioContext.setResponse(RouteDetailsApi.getRouteDetails(string));
    }

    @When("I call the All Vehicles API")
    public void i_call_the_all_vehicles_api() {
        scenarioContext.setResponse(AllVehiclesApi.getAllVehicles());
    }

    @When("I call the All Amenities API")
    public void i_call_the_all_amenities_api() {
        scenarioContext.setResponse(AllAmenitiesApi.getAllAmenities());
    }

    @When("I call the User Bookings API For User Id {string}")
    public void i_call_the_user_bookings_api_for_user_id(String string) {
        scenarioContext.setResponse(UserBookingsApi.getUserBookings(string));
    }

    @When("I call the Trip Details V2 API with Trip Id {string} , Sub Trip Id {string} and Date of Journey {string}")
    public void i_call_the_trip_details_v2_api_with_trip_id_sub_trip_id_and_date_of_journey(String string, String string2, String string3) {
        scenarioContext.setResponse(TripDetailsV2Api.getTripDetailsV2(string,string2,string3));
    }

    @When("I call the Partial Booking API For Booking Id {string}")
    public void i_call_the_partial_booking_api_for_booking_id(String string) {
        scenarioContext.setResponse(PartialBookingApi.getPartialBookingDetails(string));
    }

    @When("I call the SME Ratings API For User Id {string}")
    public void i_call_the_sme_ratings_api_for_user_id(String string) {
        scenarioContext.setResponse(SMERatingsApi.getSmeRatings(string));
    }

    @When("I call the Convenience Fees API with From Stop Id {string} , To Stop Id {string} , Service Id {string} , Start Date {string} and End Date {string}")
    public void i_call_the_convenience_fees_api_with_from_stop_id_to_stop_id_service_id_start_date_and_end_date(String string, String string2, String string3, String string4, String string5) {
        scenarioContext.setResponse(ConvenienceFeesApi.getConvenienceFees(string,string2,string3,string4,string5));
    }

    @When("I call the ops City API with City Name {string}")
    public void i_call_the_search_city_api_with_city_name(String string) {
        scenarioContext.setResponse(SearchCityApi.getCity(string));
    }

    @When("I call the Bus Staff API with Staff Role {string} and  Name {string}")
    public void i_call_the_bus_staff_api_with_staff_role_and_name(String string, String string2) {
        scenarioContext.setResponse(BusStaffApi.getBusStaff(string,string2));
    }

    @When("I call the User Wallet API with User Id {string}")
    public void i_call_the_user_wallet_api_with_user_id(String string) {
        scenarioContext.setResponse(UserWalletApi.getUserWallet(string));
    }

    @When("I call the Wallet Transactions API with User Id {string}")
    public void i_call_the_wallet_transactions_api_with_user_id(String string) {
        scenarioContext.setResponse(WalletTransactionsApi.getWalletTransactions(string));
    }















}

