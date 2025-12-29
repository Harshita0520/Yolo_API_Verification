package stepDefinitions;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.api.*;

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

    @When("I call the Edit Trips API")
    public void i_call_the_edit_trips_api() {
        scenarioContext.setResponse(EditTripApi.getTripDetails());
    }

    @When("I call the Vehicle Search API with vehicle number {string} and status {string}")
    public void i_call_the_vehicle_search_api(String vehicleNumber, String status) {
        scenarioContext.setResponse(VehicleSearchApi.getVehicle(vehicleNumber,status));
    }

    @When("I call the Trip Conflict Bookings API with {string} Details")
    public void i_call_the_trip_conflict_bookings_api(String details) {
        Response response = TripConflictBookingApi.getConflictBookings(details);
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

    @When("I call the PNR Details API")
    public void i_call_the_pnr_details_api() {
        scenarioContext.setResponse(PnrDetailsApi.getPnrDetails());
    }








}

