package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Main.feature"},
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}
)

public class TestingRunner extends AbstractTestNGCucumberTests{

}
