package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_00_Login.feature"},
        glue = {"StepDefinitions"}

)

public class _00_RunLogin extends AbstractTestNGCucumberTests {
}
