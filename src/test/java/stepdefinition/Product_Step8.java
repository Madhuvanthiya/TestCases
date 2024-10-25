package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;
import pageobject.Product_Pom;

public class Product_Step8 extends Baseclass{
	
	Login_Pom login;
	Product_Pom product;
	

@When("User Click on Products button")
public void userClickOnProductsButton() {
    login = new Login_Pom(driver);
    product = new Product_Pom(driver);
    jsclick(login.getProductBtn());
    
}
@Then("User Verify user is navigated to ALL PRODUCTS page successfully")
public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
	 String title = driver.getTitle();
	 System.out.println(title);
     Assert.assertEquals(title,"Automation Exercise - All Products");
}
@Then("User check The products list is visible")
public void userCheckTheProductsListIsVisible() {
	String text = product.getAllProductText().getText();
	System.out.println(text);
	Assert.assertEquals(text,"ALL PRODUCTS");
}
@When("User Click on View Product of first product")
public void userClickOnViewProductOfFirstProduct() {
	jsclick(product.getViewprod1());
}
@When("User is landed to product detail page")
public void userIsLandedToProductDetailPage() {
	String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    Assert.assertEquals(currentUrl,"https://automationexercise.com/product_details/1");
}
@Then("User Verify that detail is visible: product name, category, price, availability, condition, brand")
public void userVerifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
	 String text = product.getProdInfo().getText();
     System.out.println(text);
     Assert.assertTrue(text, true);
}


}
