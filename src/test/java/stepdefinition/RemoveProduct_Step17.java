package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CartPage_Pom;
import pageobject.CheckOut_Pom;
import pageobject.LogOut_Pom;
import pageobject.Login_Pom;
import pageobject.Product_Pom;

public class RemoveProduct_Step17 extends Baseclass{
	Login_Pom login;
	LogOut_Pom logOut;
	Product_Pom product;
    CartPage_Pom cart;	
    CheckOut_Pom checkOut;

@When("User Click X button corresponding to particular product")
public void userClickXButtonCorrespondingToParticularProduct() throws InterruptedException {
    login = new Login_Pom(driver);
	logOut = new LogOut_Pom(driver);
	product = new Product_Pom(driver);
    cart = new CartPage_Pom(driver);
    checkOut = new CheckOut_Pom(driver);

	jsclick(login.getProductBtn());
    mousehover(product.getFirstProd());
    Thread.sleep(5000);
    jsclick(product.getAddcartFstPrd());
    Thread.sleep(5000);
    jsclick(product.getContShopping());    
    jsclick(login.getCartBtn());
    
    String currentUrl = driver.getCurrentUrl();
   	System.out.println(currentUrl);
   	Assert.assertEquals(currentUrl,"https://automationexercise.com/view_cart");
   	jsclick(cart.getRemoveCart());
    Thread.sleep(5000);
   
}
@Then("User should Verify that product is removed from the cart")
public void userShouldVerifyThatProductIsRemovedFromTheCart() throws InterruptedException {
    String text = checkOut.getEmptyCart().getText();
    Thread.sleep(5000);
    System.out.println(text);
    Assert.assertEquals(text,"Cart is empty!");
}

}
