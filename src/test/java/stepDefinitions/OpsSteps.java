package stepDefinitions;

import context.ScenarioContext;
import io.cucumber.java.en.When;
import org.OPS.gds.GroundTrips;
import org.OPS.gds.GroundVehicle;
import org.OPS.gds.PartnerPnr;
import org.OPS.search.Driver;

public class OpsSteps {

    private final ScenarioContext scenarioContext;

    public OpsSteps(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @When("I call the Driver API with Driver Name {string}")
    public void i_call_the_driver_api_with_driver_name(String string) {
        scenarioContext.setResponse(Driver.getOpsStaff_DriverName(string));
    }

    @When("I call the Captain API with Captain Name {string}")
    public void i_call_the_captain_api_with_captain_name(String string) {
        scenarioContext.setResponse(Driver.getOpsStaff_DriverName(string));
    }

    @When("I call the Ground Ops API with Ground Ops Name {string}")
    public void i_call_the_ground_ops_api_with_ground_ops_name(String string) {
        scenarioContext.setResponse(Driver.getOpsStaff_DriverName(string));
    }

    @When("I call the Ground Trips API with start date {string}, end date {string} and Service Id {string}")
    public void i_call_the_ground_trips_api_with_start_date_end_date_and_service_id(String string, String string2, String string3) {
        scenarioContext.setResponse(GroundTrips.getGroundTrips(string,string2,string3));
    }

    @When("I call the Ground Vehicle API with Vehicle Number {string}")
    public void i_call_the_ground_vehicle_api_with_vehicle_number(String string) {
         scenarioContext.setResponse(GroundVehicle.getGroundVehicle(string));
    }

    @When("I call the Partner Pnr API with Trip Id {string}")
    public void i_call_the_partner_pnr_api_with_trip_id(String string) {
        scenarioContext.setResponse(PartnerPnr.getPartnerPnr(string));
    }






}
