package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Pom {

WebDriver driver;
	
	public LogOut_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[10]//a")
	WebElement loginUsertext;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[5]//a//i")
	WebElement deleteBtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoginUsertext() {
		return loginUsertext;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}


}
