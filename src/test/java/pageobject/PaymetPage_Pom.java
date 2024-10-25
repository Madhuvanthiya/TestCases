package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymetPage_Pom {
	WebDriver driver;
	
	public PaymetPage_Pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form[@id='payment-form']//div//input[@class='form-control']")
	WebElement nameOnCard;
	@FindBy(xpath="//form[@id='payment-form']//div[2]//input[@class='form-control card-number']")
	WebElement cardNumber;
	@FindBy(xpath="//form[@id='payment-form']//div[3]//input[@class='form-control card-cvc']")
	WebElement cvv;
	@FindBy(xpath="//form[@id='payment-form']//div[3]//div[2]//input[@name='expiry_month']")
	WebElement expMonth;
	@FindBy(xpath="//form[@id='payment-form']//div[3]//div[3]//input[@name='expiry_year']")
	WebElement expYear;
	@FindBy(xpath=" //form[@id='payment-form']//div[5]//div//button[@id='submit']")
	WebElement payConformOrder;
	@FindBy(xpath="//form[@id='payment-form']//div[4]//div[@id='success_message']//div")
	WebElement successMsg;
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	WebElement download;
	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
	WebElement continueBtn;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getNameOnCard() {
		return nameOnCard;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getPayConformOrder() {
		return payConformOrder;
	}
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public WebElement getDownload() {
		return download;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}


}
