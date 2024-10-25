package stepdefinition;

import org.junit.Assert;

import factory.Baseclass;
import io.cucumber.java.en.When;
import pageobject.AddressDetails_Pom;
import pageobject.BillingAddress_Pom;
import pageobject.CartPage_Pom;
import pageobject.CheckOut_Pom;
import pageobject.DeleteAccount_Pom;
import pageobject.LogOut_Pom;
import pageobject.Login_Pom;
import pageobject.PaymetPage_Pom;
import pageobject.Product_Pom;
import pageobject.SignUp_Pom;

public class LoginBeforeCheckOut_Step16 extends Baseclass{
	
	SignUp_Pom signUp;
	Login_Pom login;
	LogOut_Pom logOut;
	Product_Pom product;
    CartPage_Pom cart;
    AddressDetails_Pom address;
    BillingAddress_Pom bill;
    CheckOut_Pom checkOut;
    PaymetPage_Pom payment;
    DeleteAccount_Pom deleteAc;

@When("User should Click Signup or Login button")
public void userShouldClickSignupOrLoginButton() {
	signUp = new SignUp_Pom(driver);
    login = new Login_Pom(driver);
	logOut = new LogOut_Pom(driver);
	product = new Product_Pom(driver);
    cart = new CartPage_Pom(driver);
    address = new AddressDetails_Pom(driver);
    bill = new BillingAddress_Pom(driver);
    checkOut = new CheckOut_Pom(driver);
    payment = new PaymetPage_Pom(driver);
    deleteAc = new DeleteAccount_Pom(driver);

	String cururl = driver.getCurrentUrl();
	System.out.println(cururl);
    Assert.assertEquals(cururl, "https://automationexercise.com/");
   jsclick(signUp.getSignUploginbtn());
   
   String text = login.getLoginActext().getText();
   System.out.println(text);
   Assert.assertEquals(text,"Login to your account");
}
@When("User Fill email, password and click Login button")
public void userFillEmailPasswordAndClickLoginButton() throws InterruptedException {
	senddata(login.getEmail(), "madhuarun346@gmail.com");
	senddata(login.getPassword(), "Lakshitha88@");
    jsclick(login.getLoginBtn());

	String text = logOut.getLoginUsertext().getText();
	System.out.println(text);
	Assert.assertEquals(text,"Logged in as MadhuArun");
	
	jsclick(login.getProductBtn());
    mousehover(product.getFirstProd());
    jsclick(product.getAddcartFstPrd());
    jsclick(product.getContShopping());
    
    jsclick(login.getCartBtn());
    Thread.sleep(3000);
    String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertEquals(currentUrl,"https://automationexercise.com/view_cart");
	
	 jsclick(cart.getProceedCheckOut());
	 
     String fltext = address.getFlname().getText();
     String cmptext = address.getCompanyname().getText();
     String adrs1text = address.getAddress1().getText();
     String adrs2text = address.getAddress2().getText();
   	 String zipcodetext = address.getCityZipcode().getText();
   	 String cntrytext = address.getCountryName().getText();
   	 String mobiletext = address.getMobileNo().getText();	
	 String addressDetail= fltext+ cmptext+ adrs1text+ adrs2text+ zipcodetext+ cntrytext+ mobiletext;
   	 System.out.println(addressDetail);
		
   	 String bfltext = bill.getFlname().getText();
     String bcmpytext = bill.getCompanyName().getText();
     String baddrs1text = bill.getBilladdress1().getText();
     String baddr2text = bill.getBilladdress2().getText();
     String bzipcodetext = bill.getZipcode().getText();
     String bcntrytext = bill.getBillcountry().getText();
     String bmobiletext = bill.getBillmobileNo().getText();
     String billingAddress= bfltext+ bcmpytext+ baddrs1text+ baddr2text+ bzipcodetext+ bcntrytext+ bmobiletext;
     System.out.println(billingAddress);
		    
     Assert.assertEquals(addressDetail, billingAddress);
     String text3 = checkOut.getCartInfo1().getText();
     System.out.println(text3);
     Assert.assertTrue(text3,true);
	    
     senddata(checkOut.getTextMsg(), "Quality of Product is good.");
     jsclick(checkOut.getPlaceOrder());

     senddata(payment.getNameOnCard(), "Madhuarun");
     senddata(payment.getCardNumber(), "6985324714758931");
     senddata(payment.getCvv(), "2857");
     senddata(payment.getExpMonth(), "10");
     senddata(payment.getExpYear(), "2026");

    jsclick(payment.getPayConformOrder());
    
    driver.navigate().back(); 
    String pageSource = driver.getPageSource();
    Assert.assertTrue("Your order has been placed successfully!", pageSource.contains("Your order has been placed successfully!"));
    jsclick(payment.getPayConformOrder());
    
    jsclick(logOut.getDeleteBtn());
    String deletedtext = deleteAc.getDeleteActext().getText();
    System.out.println(deletedtext);
    Assert.assertEquals(deletedtext, "ACCOUNT DELETED!");
    jsclick(deleteAc.getContinueBtn1());
}


}
