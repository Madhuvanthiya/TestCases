package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.SignUp_Pom;

public class Exist_Email_Step5 extends Baseclass {
	
	SignUp_Pom signUp;
	
	
	@When("User Enter the name and already registered email address")
	public void userEnterTheNameAndAlreadyRegisteredEmailAddress() {
	    signUp = new SignUp_Pom(driver);
	    
	    jsclick(signUp.getSignUploginbtn());
	    
	    String text = signUp.getNewsignUp().getText();
	    System.out.println(text);
	    Assert.assertEquals(text,"New User Signup!");
	    
	    senddata(signUp.getName(),"MadhuArun");
	    senddata(signUp.getEmail(),"madhuarun123@gmail.com");
	    
	}
	@When("Click Signup button")
	public void clickSignupButton() {
		jsclick(signUp.getSignUpbtn());
	}
	@Then("Verify the error Email Address already exist! is visible")
	public void verifyTheErrorEmailAddressAlreadyExistIsVisible() {
		 String text = signUp.getError().getText();
		    System.out.println(text);
		    Assert.assertEquals(text,"Email Address already exist!");
	}


}
