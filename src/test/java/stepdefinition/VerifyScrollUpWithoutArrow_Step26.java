package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;

public class VerifyScrollUpWithoutArrow_Step26 extends Baseclass {
	Login_Pom login;

@When("User Scroll up page to top")
public void userScrollUpPageToTop() throws InterruptedException {
	login = new Login_Pom(driver);
    
	 scrollBottom();
	 String text = login.getSubscriptionText().getText();
	 System.out.println(text);
    Assert.assertEquals(text,"SUBSCRIPTION");
    Thread.sleep(6000);
   		
    jsclick(login.getArrowBtn());
    
    scrollUp();
    Thread.sleep(3000);
    
    String text1 = login.getTextpractice().getText();
    System.out.println(text1);
    Assert.assertEquals(text1,"Full-Fledged practice website for Automation Engineers");
}


}
