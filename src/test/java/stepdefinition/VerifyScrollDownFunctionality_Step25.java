package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;

public class VerifyScrollDownFunctionality_Step25 extends Baseclass {
	Login_Pom login;

@When("User Click on arrow at bottom right side to move upward")
public void userClickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
	 login = new Login_Pom(driver);
	    
	 scrollBottom();
	 String text = login.getSubscriptionText().getText();
	 System.out.println(text);
     Assert.assertEquals(text,"SUBSCRIPTION");
     Thread.sleep(6000);
    		
     jsclick(login.getArrowBtn());
}
@Then("User should Verify that page is scrolled up and {string} text is visible on screen")
public void userShouldVerifyThatPageIsScrolledUpAndTextIsVisibleOnScreen(String string) {
    String text = login.getTextpractice().getText();
    System.out.println(text);
    Assert.assertEquals(text,string);
}


}
