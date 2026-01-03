package hooks;

import context.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.utils.LoggerUtil;

public class Hooks {

    private final ScenarioContext scenarioContext;

    public Hooks(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        LoggerUtil.log("🚀 Starting scenario: " + scenario.getName());
        // Clear previous API response to avoid cross-contamination
        scenarioContext.setResponse(null);
    }

    @After
    public void afterScenario(Scenario scenario) {
        LoggerUtil.log("🏁 Finished scenario: " + scenario.getName());

        if (scenarioContext.getResponse() != null) {
            LoggerUtil.log("Response Status Code: " + scenarioContext.getResponse().getStatusCode());
            LoggerUtil.log("Response Body: " + scenarioContext.getResponse().asPrettyString());
        } else {
            LoggerUtil.log("No API response was captured for this scenario.");
        }

        if (scenario.isFailed()) {
            LoggerUtil.log("❌ Scenario failed. Consider capturing logs or performing cleanup...");
        }

        // Clear context after scenario (optional)
        scenarioContext.setResponse(null);
    }
}
