package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Functionality5",
glue = {"StepDefinition","Hooks"},
plugin = {"pretty","html:target\\CucumberReports\\Functionality5.html"},
monochrome = true)
public class Functionality5TestRunner extends AbstractTestNGCucumberTests
{

}
