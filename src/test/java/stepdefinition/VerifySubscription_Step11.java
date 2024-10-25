package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.When;
import pageobject.CartPage_Pom;
import pageobject.Login_Pom;

public class VerifySubscription_Step11 extends Baseclass {

	Login_Pom login;
	CartPage_Pom cart;
	


@When("User Click Cart button and Verify success message {string} is visible")
public void userClickCartButtonAndVerifySuccessMessageIsVisible(String string) {
	login=new Login_Pom(driver);
	cart= new CartPage_Pom(driver);
	
	jsclick(login.getCartBtn());
	scrollBottom();
	
	String text = cart.getSubscriptionText().getText();
    System.out.println(text);
    Assert.assertEquals(text,"SUBSCRIPTION");
    
    senddata(cart.getEmail(),"madhuarun123@gmail.com");
    jsclick(cart.getArrowbtn());
    
    String pageSource = driver.getPageSource();
    Assert.assertTrue("You have been successfully subscribed!", pageSource.contains(string));
}

	
}
