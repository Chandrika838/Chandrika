package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "classpath:feature",
		
		glue = {
				"Stepdefinitation","hookclass"
		},
		
		plugin = {
				
				"pretty","html:target/cucumber-report.hmtl"
				
		},
		
		monochrome = true
		
	)

  public class Testrunner
      extends AbstractTestNGCucumberTests {
	
	
}





































	

