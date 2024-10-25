package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.DeleteAccount_Pom;
import pageobject.LogOut_Pom;
import pageobject.Login_Pom;
import pageobject.SignUp_Pom;

public class LoginPage_Step2 extends Baseclass{
	SignUp_Pom signUp;
	Login_Pom login;
	LogOut_Pom logOut;
	DeleteAccount_Pom deleteAc;

@When("User should Click on Signup or Login button")
public void userShouldClickOnSignupOrLoginButton() {
	signUp = new SignUp_Pom(driver);
    login = new Login_Pom(driver);
	logOut = new LogOut_Pom(driver);
	deleteAc= new DeleteAccount_Pom(driver);
	
	String cururl = driver.getCurrentUrl();
	System.out.println(cururl);
    Assert.assertEquals(cururl, "https://automationexercise.com/");
   jsclick(signUp.getSignUploginbtn());
}
@Then("Verify Login to your account is visible")
public void verifyLoginToYourAccountIsVisible() {
	   String text = login.getLoginActext().getText();
	   System.out.println(text);
	   Assert.assertEquals(text,"Login to your account");
}
@When("User Enter correct email address and password")
public void userEnterCorrectEmailAddressAndPassword() {
	   senddata(login.getEmail(), "madhuarun344@gmail.com");
	   senddata(login.getPassword(), "Lakshitha88@");
}
@When("Click login button")
public void clickLoginButton() {
	jsclick(login.getLoginBtn());
}
@Then("Verify that Logged in as username is visible")
public void verifyThatLoggedInAsUsernameIsVisible() {
	String text = logOut.getLoginUsertext().getText();
	System.out.println(text);
	Assert.assertEquals(text,"Logged in as MadhuArun");
}
@Then("Verify that ACCOUNT DELETED! is visible")
public void verifyThatACCOUNTDELETEDIsVisible(){
	
	String text = deleteAc.getDeleteActext().getText();
    System.out.println(text);
     Assert.assertEquals(text,"ACCOUNT DELETED!");
	 jsclick(deleteAc.getContinueBtn());

}	
	

}
