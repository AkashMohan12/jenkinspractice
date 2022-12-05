package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Functionality3",
glue = {"StepDefinition","Hooks"},
plugin = {"pretty","html:target\\CucumberReports\\Functionality3.html"},
monochrome = true)
public class Functionality3TestRunner extends AbstractTestNGCucumberTests {

}
