package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.utils.ConfigReader;
import org.api.InternalTripsApi;

import static org.junit.Assert.*;

public class InternalTripsSteps {

    private Response response;
    private String token;

    @Given("I have a valid bearer token")
    public void i_have_a_valid_bearer_token() {
        token=ConfigReader.get("token_internal");
        assertTrue(token!= null);

    }


    @Given("I call internal trips API")
    public void i_call_internal_trips_api() {
        response = InternalTripsApi.getInternalTrips();
    }

    @Then("response status code should be {int}")
    public void response_status_code_should_be(Integer statusCode) {
        assertEquals(statusCode.intValue(), response.getStatusCode());
    }

    @Then("the response should match the trips JSON schema")
    public void the_response_should_match_the_trips_json_schema() {
        response.then().assertThat()
                .statusCode(200)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/InternalTrips.json"));

        System.out.println("JSON schema validation passed in Cucumber!");
    }
}
