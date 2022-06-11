package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:target/cucumber.json","html:test-output/CucumberJVM - Report/cucumber-pretty.html"},
        features = { "src/test/resources/features/Test.feature" },monochrome = true,
        glue = { "steps" })

public class TestRunner
{

}