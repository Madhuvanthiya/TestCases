package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage_Pom {
	
WebDriver driver;
	
	public CartPage_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='single-widget']//h2")
	WebElement subscriptionText;
	@FindBy(xpath="//form[@class='searchform']//input[@id='susbscribe_email']")
	WebElement email;
	@FindBy(xpath="//form[@class='searchform']//button[@id='subscribe']//i")
	WebElement arrowbtn;
	@FindBy(xpath="//section[@id='do_action']//div[@class='col-sm-6']//a")
	WebElement proceedCheckOut;
	@FindBy(xpath="//div[@class='modal-body']//p[@class='text-center']//a//u")
	WebElement registerLoginBtn;
	@FindBy(xpath="//td[@class='cart_delete']//a//i")
	WebElement removeCart;
	@FindBy(xpath="//table[@id='cart_info_table']//tbody//tr")
	WebElement cartinfo;
	@FindBy(xpath="//tbody//tr[@id='product-6']")
	WebElement prodInfoRecmd;
	
	
	public WebElement getRemoveCart() {
		return removeCart;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSubscriptionText() {
		return subscriptionText;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getArrowbtn() {
		return arrowbtn;
	}
	public WebElement getProceedCheckOut() {
		return proceedCheckOut;
	}
	public WebElement getRegisterLoginBtn() {
		return registerLoginBtn;
	}
	public WebElement getCartinfo() {
		return cartinfo;
	}
	public WebElement getProdInfoRecmd() {
		return prodInfoRecmd;
	}



}
