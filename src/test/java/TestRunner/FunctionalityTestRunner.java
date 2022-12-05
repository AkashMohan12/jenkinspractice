package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Functionalities",
glue = {"StepDefinition","Hooks"},
plugin = {"pretty","html:target\\CucumberReports\\Functionalities.html"},
monochrome = true)
public class FunctionalityTestRunner extends AbstractTestNGCucumberTests{

}
