package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddress_Pom {
	
	WebDriver driver;
	
	public BillingAddress_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@id='address_invoice']//li[2]")
	WebElement flname;
	@FindBy(xpath="//ul[@id='address_invoice']//li[3]")
	WebElement companyName;
	@FindBy(xpath="//ul[@id='address_invoice']//li[4]")
	WebElement billaddress1;
	@FindBy(xpath="//ul[@id='address_invoice']//li[5]")
	WebElement billaddress2;
	@FindBy(xpath="//ul[@id='address_invoice']//li[6]")
	WebElement zipcode;
	@FindBy(xpath="//ul[@id='address_invoice']//li[7]")
	WebElement billcountry;
	@FindBy(xpath="//ul[@id='address_invoice']//li[8]")
	WebElement billmobileNo;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFlname() {
		return flname;
	}
	public WebElement getCompanyName() {
		return companyName;
	}
	public WebElement getBilladdress1() {
		return billaddress1;
	}
	public WebElement getBilladdress2() {
		return billaddress2;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getBillcountry() {
		return billcountry;
	}
	public WebElement getBillmobileNo() {
		return billmobileNo;
	}

	

}
