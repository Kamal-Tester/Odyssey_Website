package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features="src\\test\\resources\\Feature\\Odyssey.feature",
	glue= {"StepDefination"},
	plugin= {"pretty","html:target/htmlreports.html"},monochrome = true)
	public class OdyRunner extends AbstractTestNGCucumberTests{

}
