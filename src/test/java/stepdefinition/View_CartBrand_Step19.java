package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;
import pageobject.Product_Pom;

public class View_CartBrand_Step19 extends Baseclass{
	Login_Pom login;
	Product_Pom product;
	
	@When("User Click on Productss button")
	public void userClickOnProductssButton() {
	    login = new Login_Pom(driver);
	    product = new Product_Pom(driver);

		String cururl = driver.getCurrentUrl();
		System.out.println(cururl);
	    Assert.assertEquals(cururl, "https://automationexercise.com/");
	    
	    jsclick(login.getProductBtn());
	}
	@Then("User Verify that Brands are visible on left side bar")
	public void userVerifyThatBrandsAreVisibleOnLeftSideBar() {
	    scrolldown(product.getBrands());
	    String text = product.getBrands().getText();
	    System.out.println(text);
	    Assert.assertTrue(text, true);
	}
	@When("User Click on any brand name")
	public void userClickOnAnyBrandName() {
	    jsclick(product.getHandm());
	}
	@Then("User should Verify that user is navigated to brand page and brand products are displayed")
	public void userShouldVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl,"https://automationexercise.com/brand_products/H&M");
		String text = product.getBrandHandM().getText();
		System.out.println(text);
		Assert.assertEquals(text,"BRAND - H&M PRODUCTS");
	}
	@When("User see On left side bar, click on any other brand link")
	public void userSeeOnLeftSideBarClickOnAnyOtherBrandLink() {
	    jsclick(product.getBabyHug());
	}
	@Then("User should Verify that user is navigated to that brand page and can see products")
	public void userShouldVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://automationexercise.com/brand_products/Babyhug");
		Thread.sleep(3000);
		String text = product.getBabyHugProd().getText();
		System.out.println(text);
		Assert.assertTrue(text, true);
	}




}
