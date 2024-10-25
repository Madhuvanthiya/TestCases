package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CartPage_Pom;
import pageobject.LogOut_Pom;
import pageobject.Login_Pom;
import pageobject.ProductDeteail_Pom;
import pageobject.Product_Pom;
import pageobject.SignUp_Pom;

public class VerifyCartAfterLogin_Step20 extends Baseclass{
	Login_Pom login;
	Product_Pom product;
	ProductDeteail_Pom prodDetail;
	CartPage_Pom cart;
	SignUp_Pom signUp;
	LogOut_Pom logout;


@Then("User should Verify user is navigated to ALL PRODUCTS page successfully")
public void userShouldVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() throws InterruptedException {
    login = new Login_Pom(driver);
    product = new Product_Pom(driver);
    prodDetail = new ProductDeteail_Pom(driver);
    cart = new CartPage_Pom(driver);
	signUp = new SignUp_Pom(driver);
    logout = new LogOut_Pom(driver);

	String cururl = driver.getCurrentUrl();
	System.out.println(cururl);
    Assert.assertEquals(cururl, "https://automationexercise.com/");
    
    jsclick(login.getProductBtn());
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"Automation Exercise - All Products");

    senddata(product.getSearchprodField(), "Winter Top");
    jsclick(product.getSearchSubmitBtn());
    Thread.sleep(5000);
    String text = product.getWinterTop().getText();
    System.out.println(text);
    Assert.assertTrue(text, true);
}
@When("User Add those products to cart")
public void userAddThoseProductsToCart() throws InterruptedException {
    jsclick(prodDetail.getCartWinterTop());
    jsclick(prodDetail.getContinueshoppingBtn());
    Thread.sleep(5000);

    jsclick(login.getCartBtn());
    String text = cart.getCartinfo().getText();
    System.out.println(text);
    Assert.assertTrue(text, true);

	jsclick(signUp.getSignUploginbtn());
	senddata(login.getEmail(), "madhuarun347@gmail.com");
	senddata(login.getPassword(), "Lakshitha88@");
    jsclick(login.getLoginBtn());
}
@When("User Again, go to Cart page")
public void userAgainGoToCartPage() {
	jsclick(login.getCartBtn());
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertTrue(currentUrl, true);
}
@Then("User should Verify that those products are visible in cart after login as well")
public void userShouldVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
	String text = logout.getLoginUsertext().getText();
	System.out.println(text);
	Assert.assertEquals(text,"Logged in as MadhuArun");
	
	String text1 = cart.getCartinfo().getText();
    System.out.println(text1);
    Assert.assertTrue(text1, true);
}



}
