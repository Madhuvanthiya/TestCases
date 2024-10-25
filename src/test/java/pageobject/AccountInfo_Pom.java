package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInfo_Pom {
	
    WebDriver driver;
	
	public AccountInfo_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//child::h2[@class='title text-center']//child::b[text()='Enter Account Information']")
	WebElement acinfotext;
	@FindBy(css="input[id='id_gender2']")
	WebElement radiobtn;
	@FindBy(css="input[id='password']")
	WebElement password;
	@FindBy(css="select[id='days']")
	WebElement days;
	@FindBy(css="select[id='months']")
	WebElement months;
	@FindBy(css="select[id='years']")
	WebElement years;
	@FindBy(css="input[id='newsletter']")
	WebElement checkbox1;
	@FindBy(css="input[id='optin']")
	WebElement checkbox2;
	@FindBy(css="input[id='first_name']")
	WebElement fstName;
	@FindBy(css="input[id='last_name']")
	WebElement lstName;
	@FindBy(css="input[id='company']")
	WebElement company;
	@FindBy(css="input[id='address1']")
	WebElement address1;
	@FindBy(css="input[id='address2']")
	WebElement address2;
	@FindBy(css="select[id='country']")
	WebElement country;
	@FindBy(css="input[id='state']")
	WebElement state;
	@FindBy(css="input[id='city']")
	WebElement city;
	@FindBy(css="input[id='zipcode']")
	WebElement zipcode;
	@FindBy(css="input[id='mobile_number']")
	WebElement mobNo;
	@FindBy(css="button[data-qa='create-account']")
	WebElement acBtn;
	
//	public void enterRegisterAddress(String Firstname,String Lastname,String Company,String Address1,String Address2,String City,String State,String Zipcode,String Country,String Mobilenumber) {
//		fstName.sendKeys(Firstname);
//		lstName.sendKeys(Lastname);
//		company.sendKeys(Company);
//		address1.sendKeys(Address1);
//		address2.sendKeys(Address2);
//		city.sendKeys(City);
//		state.sendKeys(State);
//		zipcode.sendKeys(Zipcode);
//		country.sendKeys(Country);
//		mobNo.sendKeys(Mobilenumber);
//	}
	
	public String getRegisterAddress() {
		return fstName.getAttribute("value")+" "+lstName.getAttribute("value")+company.getAttribute("value")+address1.getAttribute("value")+address2.getAttribute("value")+city.getAttribute("value")+
				" "+state.getAttribute("value")+" "+zipcode.getAttribute("value")+country.getAttribute("value")+mobNo.getAttribute("value");
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAcinfotext() {
		return acinfotext;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDays() {
		return days;
	}
	public WebElement getMonths() {
		return months;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	public WebElement getFstName() {
		return fstName;
	}
	public WebElement getLstName() {
		return lstName;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getMobNo() {
		return mobNo;
	}
	public WebElement getAcBtn() {
		return acBtn;
	}



}
