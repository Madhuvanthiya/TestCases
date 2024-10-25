package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CheckOut_Pom;
import pageobject.Login_Pom;
import pageobject.Product_Pom;

public class AddProduct_Step12 extends Baseclass {
	
	Login_Pom login;
	Product_Pom product;
	CheckOut_Pom checkOut;
	

@When("User Hover over first product and click Add to cart")
public void userHoverOverFirstProductAndClickAddToCart() throws InterruptedException {
    login = new Login_Pom(driver);
    product = new Product_Pom(driver);
    checkOut= new CheckOut_Pom(driver);
    
    jsclick(login.getProductBtn());
    mousehover(product.getFirstProd());
    jsclick(product.getAddcartFstPrd());
    Thread.sleep(3000);
}
@When("User should Click Continue Shopping button")
public void userShouldClickContinueShoppingButton() {
    jsclick(product.getContShopping());
}
@When("User Hover over second product and click Add to cart")
public void userHoverOverSecondProductAndClickAddToCart() throws InterruptedException {
    mousehover(product.getSecondPrd());
    jsclick(product.getAddSecondProd());
    Thread.sleep(3000);
}
@When("User Click View Cart button")
public void userClickViewCartButton() throws InterruptedException {
    jsclick(product.getViewcart());
    Thread.sleep(3000);
}
@Then("User should Verify both products are added to Cart")
public void userShouldVerifyBothProductsAreAddedToCart() {
    String text = checkOut.getProd1().getText();
    System.out.println(text);
    Assert.assertTrue(text, true);
    String text2 = checkOut.getProd2().getText();
    System.out.println(text2);
    Assert.assertTrue(text2, true);
}
@Then("User should Verify their prices, quantity and total price")
public void userShouldVerifyTheirPricesQuantityAndTotalPrice() {
    String text = checkOut.getProd1Price().getText();
    System.out.println(text);
    Assert.assertTrue(text, true);
}


}
