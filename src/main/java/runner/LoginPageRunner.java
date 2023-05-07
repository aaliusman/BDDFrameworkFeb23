package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/BOALoginPage.feature",
        glue = "stepDefinitions",
        plugin = {"pretty"},
        tags = "@Regression"
)
public class LoginPageRunner extends AbstractTestNGCucumberTests {
}
