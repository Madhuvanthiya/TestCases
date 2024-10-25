package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LogOut_Pom;
import pageobject.Login_Pom;
import pageobject.SignUp_Pom;
import pageobject.UserPage_Pom;

public class LogOut_Step4 extends Baseclass{
	SignUp_Pom signUp;
	Login_Pom login;
	LogOut_Pom logOut;
	UserPage_Pom userpage;
	

@When("User Click Logout button")
public void userClickLogoutButton() {
	signUp = new SignUp_Pom(driver);
	login = new Login_Pom(driver);
	logOut= new LogOut_Pom(driver);
	userpage = new UserPage_Pom(driver);
    
	jsclick(signUp.getSignUploginbtn());
    String text = login.getLoginActext().getText();
    System.out.println(text);
    Assert.assertEquals(text,"Login to your account");
    
    senddata(login.getEmail(),"madhuarun345@gmail.com");
    senddata(login.getPassword(),"Lakshitha88@");
    
    jsclick(login.getLoginBtn());
    
    String text1 = logOut.getLoginUsertext() .getText();
	System.out.println(text1);
	Assert.assertEquals(text1,"Logged in as MadhuArun");
	 jsclick(userpage.getLogoutBtn());
}
@Then("User Verify that user is navigated to login page")
public void userVerifyThatUserIsNavigatedToLoginPage() {
	 String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   Assert.assertEquals(currentUrl,"https://automationexercise.com/login");
}


}
