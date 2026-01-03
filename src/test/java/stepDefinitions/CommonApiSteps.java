package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import context.ScenarioContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.utils.ConfigReader;

public class CommonApiSteps {

    private String token;
    private final ScenarioContext scenarioContext;

    // ✅ Same ScenarioContext injected
    public CommonApiSteps(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Given("I have a valid bearer token")
    public void i_have_a_valid_bearer_token() {
        token = ConfigReader.get("token_internal");
        assertNotNull("Bearer token is null", token);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {

        Response response = scenarioContext.getResponse();
        assertNotNull("Response is null. API was not called.", response);

        assertEquals(statusCode.intValue(), response.getStatusCode());
    }

    @And("the {string} Api response should match the {string} JSON schema")
    public void the_response_should_match_the_json_schema(String option,String schemaName) {

        Response response = scenarioContext.getResponse();
        assertNotNull("Response is null. Cannot validate schema.", response);

        response.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(
                        "schema/"+option+"/"+ schemaName + ".json"
                ));

        System.out.println("✅ JSON schema validation passed for: " + schemaName);
    }
}
