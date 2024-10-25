package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CheckOut_Pom;
import pageobject.Login_Pom;
import pageobject.ProductDeteail_Pom;
import pageobject.Product_Pom;

public class VerifyProduct_Step13 extends Baseclass {
	
	Login_Pom login;
	Product_Pom product;
	ProductDeteail_Pom prodDetail;
	CheckOut_Pom checkOut;
	

@When("User Click View Product for any product on home page")
public void userClickViewProductForAnyProductOnHomePage() {
    login = new Login_Pom(driver);
    product = new Product_Pom(driver);
    checkOut = new CheckOut_Pom(driver);
    prodDetail = new ProductDeteail_Pom(driver);
    
    jsclick(login.getProductBtn());
    scrolldown(product.getViewProduct());
    jsclick(product.getViewProduct());
}
@Then("User should Verify product detail is opened")
public void userShouldVerifyProductDetailIsOpened() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"Automation Exercise - Product Details");
}

@When("User Increase quantity to {string}")
public void userIncreaseQuantityTo(String string) {
	jsclick(prodDetail.getAddQuantity());
	jsclick(prodDetail.getAddQuantity());
    prodDetail.getAddQuantity().clear();
    senddata(prodDetail.getAddQuantity(),string);
}
@When("User should Click Add to cart button")
public void userShouldClickAddToCartButton() throws InterruptedException {
   jsclick(prodDetail.getAddCart());
   Thread.sleep(5000);
}
@When("Click View Cart button")
public void clickViewCartButton() {
   jsclick(prodDetail.getViewCart());
}
@Then("User should Verify that product is displayed in cart page with exact quantity")
public void userShouldVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
    String text = checkOut.getQuqntity11().getText();
    System.out.println(text);
    Assert.assertEquals(text,"4");
}


}
