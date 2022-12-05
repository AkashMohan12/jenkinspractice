package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Functionality4",
glue = {"StepDefinition","Hooks"},
plugin = {"pretty","html:target\\CucumberReports\\Functionality4.html"},
monochrome = true)
public class Functionality4TestRunner extends AbstractTestNGCucumberTests{

}
