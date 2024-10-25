package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;
import pageobject.Product_Pom;
import pageobject.SearchProd_Pom;

public class SearchProduct_Step9 extends Baseclass{

	Login_Pom login;
	Product_Pom product;
	SearchProd_Pom searchpd;
	
	@When("User Enter product name in search input and click search button")
	public void userEnterProductNameInSearchInputAndClickSearchButton() {
		login= new Login_Pom(driver);
	    product= new Product_Pom(driver);
	    searchpd= new SearchProd_Pom(driver);
	    
	    jsclick(login.getProductBtn());
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title,"Automation Exercise - All Products");
	    
	    senddata(product.getSearchprodField(), "TOP");
		jsclick(product.getSearchSubmitBtn());
	}
	@Then("User should Verify SEARCHED PRODUCTS is visible")
	public void userShouldVerifySEARCHEDPRODUCTSIsVisible() {
		String text = searchpd.getSearchprodText().getText();
	    System.out.println(text);
	    Assert.assertEquals(text,"SEARCHED PRODUCTS");
	}
	@Then("User Verify all the products related to search are visible")
	public void userVerifyAllTheProductsRelatedToSearchAreVisible() {
		String text = searchpd.getProdItems().getText();
	    System.out.println(text);
	    Assert.assertTrue(text, true);
	}

}
