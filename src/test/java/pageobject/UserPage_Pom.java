package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage_Pom {
	
    WebDriver driver;
	
	public UserPage_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[4]//a//i")
	WebElement logoutBtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}


}
