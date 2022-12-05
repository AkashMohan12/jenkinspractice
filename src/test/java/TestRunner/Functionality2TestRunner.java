package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Functionality2",
glue = {"StepDefinition","Hooks"},
plugin = {"pretty","html:target\\CucumberReports\\Functionality2.html"},
monochrome = true)
public class Functionality2TestRunner extends AbstractTestNGCucumberTests
{

}
