package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login_Pom;
import pageobject.ProductDeteail_Pom;
import pageobject.Product_Pom;

public class AddReview_Step21 extends Baseclass{
	Login_Pom login;
	Product_Pom product;
	ProductDeteail_Pom prodDetail; 

@When("User Click on View Product button")
public void userClickOnViewProductButton() {
	login = new Login_Pom(driver);
	product = new Product_Pom(driver);
	prodDetail = new ProductDeteail_Pom(driver);
		    
    jsclick(login.getProductBtn());
    jsclick(product.getViewprod1());
}
@Then("User should Verify Write Your Review is visible")
public void userShouldVerifyWriteYourReviewIsVisible() {
    String text = prodDetail.getWriteReview().getText();
    System.out.println(text);
    Assert.assertEquals(text,"WRITE YOUR REVIEW");
}
@When("User Enter name, email and review")
public void userEnterNameEmailAndReview() throws InterruptedException {
    senddata(prodDetail.getName(), "MadhuArun");
    senddata(prodDetail.getEmail(), "madhuarun159@gmail.com");
    senddata(prodDetail.getAddReview(), "I like the Products.");
    jsclick(prodDetail.getSubmitBtn());

    Thread.sleep(3000);
    String pageSource = driver.getPageSource();
	Assert.assertTrue("Thank you for your review.", pageSource.contains("Thank you for your review."));
}



}
