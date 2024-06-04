package utils.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        monochrome = true,
        features = {"src/main/resources/tests/"}
        , glue = {"utils.hooks", "stepdefs"}
        , plugin = {"usage", "json:target/cucumber-reports/Cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@debug or @regressionPack"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

