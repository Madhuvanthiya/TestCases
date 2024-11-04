package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass{
	 WebDriver driver;
	
	@Before
	public void setUp() {
		openbrowser();
		maxbrowser();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		fetchurl("https://automationexercise.com/");
		implicitwait();
	}
			
	@After
	public void tearDown(Scenario scenario) {
		quitbrowser();
	}
	@AfterStep
	public void screenshot(Scenario scenario) throws IOException {
//		 if (!scenario.isFailed()) {
//	            if (driver instanceof TakesScreenshot) {
//	                TakesScreenshot ts = (TakesScreenshot) driver;
//	                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//	                
//	                // Attach the screenshot to the scenario report
//	                scenario.attach(screenshot, "image/png", "Screenshot - Passed Scenario");
//	            }
//	        }
//		if(scenario.isFailed()) {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot,"image/png",scenario.getName());
//		}
		addscreenshot(scenario);

	}
	
	}
	
	


