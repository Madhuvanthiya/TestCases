package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CartPage_Pom;
import pageobject.SignUp_Pom;

public class RecommendedItem_Step22 extends Baseclass{
	SignUp_Pom signup;
	CartPage_Pom cart;

@Then("User should Verify RECOMMENDED ITEMS are visible")
public void userShouldVerifyRECOMMENDEDITEMSAreVisible() {
	signup = new SignUp_Pom(driver);
	cart = new CartPage_Pom(driver);
	
    scrolldown(signup.getRecommendedItem());
    String text = signup.getRecommendedItem().getText();
    System.out.println(text);
    Assert.assertEquals(text,"RECOMMENDED ITEMS");
    
}
@When("User Click on Add To Cart on Recommended product")
public void userClickOnAddToCartOnRecommendedProduct() throws InterruptedException {
    jsclick(signup.getAddCartRecmd());
    Thread.sleep(3000);
    jsclick(signup.getViewcartRecmd());
}
@Then("User should Verify that product is displayed in cart page")
public void userShouldVerifyThatProductIsDisplayedInCartPage() {
    String text = cart.getProdInfoRecmd().getText();
    System.out.println(text);
    Assert.assertTrue(text, true);
}


}
