package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\HomePageAndSignIn",
glue = {"StepDefinition","hooks"},
plugin = {"pretty","html:target\\CucumberReports\\HomePageReport.html"},
monochrome = true)
public class HomePageTestRunner extends AbstractTestNGCucumberTests
{
	
}
