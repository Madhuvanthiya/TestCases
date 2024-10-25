package stepdefinition;

import org.openqa.selenium.WebDriver;

import factory.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
	public void tearDown() {
		quitbrowser();
	}
//	@AfterStep
//	public void addScreenshot(Scenario scenario) {
//		if(scenario.isFailed())
//		{
//			TakesScreenshot ts= (TakesScreenshot) driver;
//			byte[]screenshot =ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot,"img/png",scenario.getName());
//		}
	}


