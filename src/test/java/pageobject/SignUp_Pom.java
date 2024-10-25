package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Pom {
	

	WebDriver driver;
	
	public SignUp_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[4]//a")
	WebElement signUploginbtn;
	@FindBy(css="div[class='signup-form'] h2")
	WebElement newsignUp;
	@FindBy(css="form input[placeholder='Name']")
	WebElement name;
	@FindBy(css="form[action='/signup'] input[placeholder='Email Address']")
	WebElement email;
	@FindBy(css="button[data-qa='signup-button']")
	WebElement signUpbtn;
	@FindBy(xpath="//form[@action='/signup']//p[text()='Email Address already exist!']")
	WebElement error;
	@FindBy(xpath="//div[@class='left-sidebar']//div[@id='accordian']")
	WebElement categories;
	@FindBy(xpath="//div[@class='recommended_items']//h2[@class='title text-center']")
	WebElement recommendedItem; 
	@FindBy(xpath="(//div[@class='productinfo text-center']//a[@data-product-id='6']//i)[2]")
	WebElement addCartRecmd;
	@FindBy(xpath="//p[@class='text-center']//a")
	WebElement viewcartRecmd;
	@FindBy(xpath="//a[@id='scrollUp']//i")
	WebElement upArrow;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignUploginbtn() {
		return signUploginbtn;
	}
	public WebElement getNewsignUp() {
		return newsignUp;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getSignUpbtn() {
		return signUpbtn;
	}
	public WebElement getCategories() {
		return categories;
	}
	public WebElement getRecommendedItem() {
		return recommendedItem;
	}
	public WebElement getAddCartRecmd() {
		return addCartRecmd;
	}
	public WebElement getViewcartRecmd() {
		return viewcartRecmd;
	}
	public WebElement getUpArrow() {
		return upArrow;
	}
	public WebElement getError() {
		return error;
	}



}
