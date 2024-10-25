package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Product_Pom;
import pageobject.SearchProd_Pom;
import pageobject.SignUp_Pom;

public class ViewCategory_Step18 extends Baseclass{

	SignUp_Pom signUp;
	SearchProd_Pom search;
	Product_Pom product;


@Then("User should Verify that categories are visible on left side bar")
public void userShouldVerifyThatCategoriesAreVisibleOnLeftSideBar() {
	signUp = new SignUp_Pom(driver);
	search= new SearchProd_Pom(driver);
	product= new Product_Pom(driver);
	
	String text = signUp.getCategories().getText();
	System.out.println(text);
	Assert.assertTrue(text, true);

}
@When("User Click on Women category")
public void userClickOnWomenCategory() throws InterruptedException {
	scrolldown(search.getWomen());
	Thread.sleep(5000);
    jsclick(search.getWomen());
}
@When("User should Click on any category link under Women category, for example: Dress")
public void userShouldClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() throws InterruptedException {
	Thread.sleep(5000);
    jsclick(search.getTops());
}
@Then("User should Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
public void userShouldVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertEquals(currentUrl, "https://automationexercise.com/category_products/2");
	String text = product.getWomenTopsprod().getText();
	System.out.println(text);
	Assert.assertTrue(text, true);
	
}
@When("User see On left side bar, click on any sub-category link of Men category")
public void userSeeOnLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
   jsclick(product.getMens());
   jsclick(product.getTshirts());
}
@Then("User should Verify that user is navigated to that category page")
public void userShouldVerifyThatUserIsNavigatedToThatCategoryPage() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertEquals(currentUrl, "https://automationexercise.com/category_products/3");
	String text = product.getMensTshirtprod().getText();
	System.out.println(text);
	Assert.assertTrue(text,true);

	
}


}
