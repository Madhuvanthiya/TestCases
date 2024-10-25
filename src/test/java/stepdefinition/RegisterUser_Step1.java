package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import factory.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AccountInfo_Pom;
import pageobject.CreateAccount_Pom;
import pageobject.DeleteAccount_Pom;
import pageobject.LogOut_Pom;
import pageobject.SignUp_Pom;

public class RegisterUser_Step1 extends Baseclass{
	
	AccountInfo_Pom accountInfo;
	CreateAccount_Pom createAccount;
	DeleteAccount_Pom deleteAccount;
	LogOut_Pom logOut;
	SignUp_Pom signUp;
	

@Given("User Verify that home page is visible successfully")
public void userVerifyThatHomePageIsVisibleSuccessfully() {
	accountInfo = new AccountInfo_Pom(driver);
	createAccount = new CreateAccount_Pom(driver);
	deleteAccount = new DeleteAccount_Pom(driver);
	logOut = new LogOut_Pom(driver);
	signUp = new SignUp_Pom(driver);
	

	String cururl = driver.getCurrentUrl();
	System.out.println(cururl);
    Assert.assertEquals(cururl, "https://automationexercise.com/");
}
@When("User should Click on SignUp or Login button")
public void userShouldClickOnSignUpOrLoginButton() {
	clickbutton(signUp.getSignUploginbtn());  
}
@Then("Verify the New User SignUp! is visible")
public void verifyTheNewUserSignUpIsVisible() {
	String newsignup = signUp.getNewsignUp().getText();
	System.out.println(newsignup);
	Assert.assertEquals(newsignup, "New User Signup!");
}
@When("Enter the Name and Email address of User")
public void enterTheNameAndEmailAddressOfUser() {
	senddata(signUp.getName(), "MadhuArun");
	senddata(signUp.getEmail(), "madhuarun128@gmail.com");
}
@When("User Click SignUp button")
public void userClickSignUpButton() {
	jsclick(signUp.getSignUpbtn());

}
@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
	 String text = accountInfo.getAcinfotext().getText();
	   System.out.println(text);
	   Assert.assertEquals(text,"ENTER ACCOUNT INFORMATION");
}
@When("User fill details:Title,Name,Email,Password,Date of birth")
public void userFillDetailsTitleNameEmailPasswordDateOfBirth() {
	jsclick(accountInfo.getRadiobtn());
    senddata(accountInfo.getPassword(), "Lakshitha09@");
    WebElement days=accountInfo.getDays();
    Select select= new Select(days);
    select.selectByValue("26");
    WebElement months=accountInfo.getMonths();
    Select monthsl= new Select(months);
    monthsl.selectByValue("8");
    WebElement years=accountInfo.getYears();
    Select slyear = new Select(years);
    slyear.selectByValue("1995");
}
@When("Select checkbox SignUp for our newsletter!")
public void selectCheckboxSignUpForOurNewsletter() {
	jsclick(accountInfo.getCheckbox1());

}
@When("Select checkbox Receive special offers from our partners!")
public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
	jsclick(accountInfo.getCheckbox2());
}
@When("Fill details: First name,Last name,Company,Address,Address2,Country,State,City,Zipcode,Mobile Number")
public void fillDetailsFirstNameLastNameCompanyAddressAddress2CountryStateCityZipcodeMobileNumber() {
	senddata(accountInfo.getFstName(), "Madhu");
    senddata(accountInfo.getLstName(), "Arun");
    senddata(accountInfo.getCompany(), "Axess Technology");
    senddata(accountInfo.getAddress1(), "Street no.4,Periyar Nagar,");
    senddata(accountInfo.getAddress2(), "Velachery, Chennai-100");
    WebElement country=accountInfo.getCountry();
    Select slcountry = new Select(country);
    slcountry.selectByValue("India");
    senddata(accountInfo.getState(), "TamilNadu"); 
    senddata(accountInfo.getCity(), "Chennai");
    senddata(accountInfo.getZipcode(), "600100");
    senddata(accountInfo.getMobNo(), "9587463241");
}
@When("Click Create Account button")
public void clickCreateAccountButton() {
	jsclick(accountInfo.getAcBtn());
}
@Then("Verify that ACCOUNT CREATED! is visible")
public void verifyThatACCOUNTCREATEDIsVisible() {
	String text = createAccount.getAcnCreatedtext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT CREATED!");
}
@When("User Click Continue button")
public void userClickContinueButton() {
	jsclick(createAccount.getContinuebtn());
}
@Then("User Verify that Logged in as Username is visible")
public void userVerifyThatLoggedInAsUsernameIsVisible() {
	    String loggedin = logOut.getLoginUsertext().getText();
		System.out.println(loggedin);
	    Assert.assertEquals(loggedin, "Logged in as MadhuArun");
}
@When("User Click Delete Account button")
public void userClickDeleteAccountButton() {
	jsclick(logOut.getDeleteBtn());
}
@Then("Verify that ACCOUNT DELETED! is visible and Click Continue button")
public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
	String text = deleteAccount.getDeleteActext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT DELETED!");
    jsclick(deleteAccount.getContinueBtn1());
}



}
