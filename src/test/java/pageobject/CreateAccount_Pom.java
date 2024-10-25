package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount_Pom {
	
    WebDriver driver;
	
	public CreateAccount_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="[data-qa='account-created']")
	WebElement acnCreatedtext;
	@FindBy(css="[data-qa='continue-button']")
	WebElement continuebtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAcnCreatedtext() {
		return acnCreatedtext;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
