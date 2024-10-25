package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;

public class Subscription_Step10 extends Baseclass{
	
	Login_Pom login;
	

@When("User Scroll down to footer")
public void userScrollDownToFooter() {
    login = new Login_Pom(driver);
    
    scrollBottom();
}
@Then("User should Verify text {string}")
public void userShouldVerifyText(String string) throws InterruptedException {
	String text = login.getSubscriptionText().getText();
    System.out.println(text);
    Assert.assertEquals(text,"SUBSCRIPTION");
    Thread.sleep(6000);
}
@When("User Enter the email address in input and click arrow button")
public void userEnterTheEmailAddressInInputAndClickArrowButton() throws InterruptedException {
	senddata(login.getSubscremail(), "madhuarun123@gmail.com");
    jsclick(login.getArrowBtn());
    Thread.sleep(5000);
}
@Then("Usershould Verify the success message {string} is visible")
public void usershouldVerifyTheSuccessMessageIsVisible(String string) {
	String pageSource = driver.getPageSource();
	Assert.assertTrue("You have been successfully subscribed!", pageSource.contains(string));
}

}
