package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.ContactUs_Pom;
import pageobject.Login_Pom;

public class ContactUs_Step6 extends Baseclass {
	
	Login_Pom login;
	ContactUs_Pom contactus;
	

@When("User Click on Contact Us button")
public void userClickOnContactUsButton() {
    login = new Login_Pom(driver);
    contactus = new ContactUs_Pom(driver);
    jsclick(login.getContactUsBtn());
}
@Then("Verify GET IN TOUCH is visible")
public void verifyGETINTOUCHIsVisible() {
	String text = contactus.getGetInTouchText().getText();
	System.out.println(text);
    Assert.assertEquals(text,"GET IN TOUCH");
}
@When("User Enter the name, email, subject and message")
public void userEnterTheNameEmailSubjectAndMessage() {
	scrolldown(contactus.getName());
    senddata(contactus.getName(),"MadhuArun");
    senddata(contactus.getEmail(),"madhuarun123@gmail.com");
    senddata(contactus.getSubject(),"Automation Testing");
    senddata(contactus.getMsgArea(),"This web site is useful for my Testing Practice. The Test Cases given in this website is good to learn Automation Testing as a beginner.");
}
@When("User should Upload the file")
public void userShouldUploadTheFile() {
    senddata(contactus.getUploadfile(),"C:\\Users\\arunn\\OneDrive\\Pictures\\Screenshot 2024-09-25 100120-frontview Home.jpg");
}
@When("User should Click Submit button")
public void userShouldClickSubmitButton() {
	jsclick(contactus.getSubmitBtn());
}
@When("User Click OK button")
public void userClickOKButton() {
	alertOk();
}
@Then("User Verify the success message Success! Your details have been submitted successfully. is visible")
public void userVerifyTheSuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
	 String text = contactus.getSuccessMsg().getText();
	 System.out.println(text);
     Assert.assertEquals(text,"Success! Your details have been submitted successfully.");
}
@Then("User should Click Home button and verify that landed to home page successfully")
public void userShouldClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
	 jsclick(contactus.getHomeBtn());
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   Assert.assertEquals(currentUrl,"https://automationexercise.com/");
}


}
