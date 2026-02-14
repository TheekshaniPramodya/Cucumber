package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Tells JUnit to use the Cucumber runner
@CucumberOptions(
        features = "src/test/resources/features", // Path to your .feature files [cite: 1011]
        glue = "stepDefinition",             // Path to your step definition classes [cite: 1012]
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Generates a readable report [cite: 859]
)
public class TestRunner {
}