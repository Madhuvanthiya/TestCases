package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetails_Pom {
	
	WebDriver driver;
	
	public AddressDetails_Pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@id='address_delivery']//li[2]")
	WebElement flname;
	@FindBy(xpath="//ul[@id='address_delivery']//li[3]")
	WebElement companyname;
	@FindBy(xpath="//ul[@id='address_delivery']//li[4]")
	WebElement address1;
	@FindBy(xpath="//ul[@id='address_delivery']//li[5]")
	WebElement address2;
	@FindBy(xpath="//ul[@id='address_delivery']//li[6]")
	WebElement cityZipcode;
	@FindBy(xpath="//ul[@id='address_delivery']//li[7]")
	WebElement countryName;
	@FindBy(xpath="//ul[@id='address_delivery']//li[8]")
	WebElement mobileNo;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFlname() {
		return flname;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCityZipcode() {
		return cityZipcode;
	}
	public WebElement getCountryName() {
		return countryName;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	



}
