package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	
WebDriver driver;
	
	public Login_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="div[class='login-form'] h2")
	WebElement loginActext;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[8]//a")
	WebElement contactUsBtn;
	@FindBy(xpath="//form[@action='/login']//child:: input[@placeholder='Email Address']")
	WebElement email;
	@FindBy(xpath="//form[@action='/login']//child:: input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//form[@action='/login']//child::button[@class='btn btn-default']")
	WebElement loginBtn;
	@FindBy(xpath="//form[@action='/login']//p[text()='Your email or password is incorrect!']")
	WebElement errorMsg;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[5]//a//i")
	WebElement testcaseBtn;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[2]//a//i")
	WebElement productBtn;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[3]//a//i")
	WebElement cartBtn;
	@FindBy(xpath="//div[@class='single-widget']//h2")
	WebElement subscriptionText;
	@FindBy(xpath="//form[@class='searchform']//input[@id='susbscribe_email']")
	WebElement subscremail;
	@FindBy(xpath="//form[@class='searchform']//child::button[@id='subscribe']")
	WebElement arrowBtn;
	@FindBy(xpath="//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
	WebElement textpractice;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoginActext() {
		return loginActext;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	public WebElement getContactUsBtn() {
		return contactUsBtn;
	}
	public WebElement getTestcaseBtn() {
		return testcaseBtn;
	}
	public WebElement getProductBtn() {
		return productBtn;
	}
	public WebElement getCartBtn() {
		return cartBtn;
	}
	public WebElement getSubscriptionText() {
		return subscriptionText;
	}
	public WebElement getSubscremail() {
		return subscremail;
	}
	public WebElement getArrowBtn() {
		return arrowBtn;
	}
	public WebElement getTextpractice() {
		return textpractice;
	}


}
