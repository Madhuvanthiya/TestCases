package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;
import pageobject.SignUp_Pom;

public class Fail_Login_Step3 extends Baseclass {
	
	SignUp_Pom signUp;
	Login_Pom login;
	

@When("User Click on Signup or Login button")
public void userClickOnSignupOrLoginButton() {
    signUp = new SignUp_Pom(driver);
    login = new Login_Pom(driver);
    
    jsclick(signUp.getSignUploginbtn());
}
@Then("User Verify that Login to your account is visible")
public void userVerifyThatLoginToYourAccountIsVisible() {
    String text = login.getLoginActext().getText();
    System.out.println(text);
    Assert.assertEquals(text,"Login to your account");
}
@When("User Enter incorrect email address and password")
public void userEnterIncorrectEmailAddressAndPassword() {
	senddata(login.getEmail(), "madhuarun123@gmail.com");
    senddata(login.getPassword(), "Lakshitha09@");
    jsclick(login.getLoginBtn());
}
@Then("User Verify error message as Your email or password is incorrect! is visible")
public void userVerifyErrorMessageAsYourEmailOrPasswordIsIncorrectIsVisible() {
	String text = login.getErrorMsg().getText();
    System.out.println(text);
    Assert.assertEquals(text,"Your email or password is incorrect!");
}



}
