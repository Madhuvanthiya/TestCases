package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount_Pom {
	
    WebDriver driver;
	
	public DeleteAccount_Pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//h2[@class='title text-center']//b")
	WebElement deleteActext;
	
	@FindBy(xpath="//div//a[@class='btn btn-primary']")
	WebElement continueBtn1;
	@FindBy(css="div[class='pull-right'] a")
	WebElement continueBtn;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDeleteActext() {
		return deleteActext;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getContinueBtn1() {
		return continueBtn1;
	}




}
