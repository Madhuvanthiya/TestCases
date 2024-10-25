package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasePage_Pom {
	
   WebDriver driver;
	
	public TestCasePage_Pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[@class='title text-center']//b")
	WebElement tescaseText;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getTescaseText() {
		return tescaseText;
	}

}
