package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_04_AddingFields.feature"},
        glue = {"StepDefinitions"}
)
public class _04_Runner extends AbstractTestNGCucumberTests {
}
