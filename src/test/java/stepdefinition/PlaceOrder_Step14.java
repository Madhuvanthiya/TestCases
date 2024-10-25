package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import factory.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AccountInfo_Pom;
import pageobject.AddressDetails_Pom;
import pageobject.BillingAddress_Pom;
import pageobject.CartPage_Pom;
import pageobject.CheckOut_Pom;
import pageobject.CreateAccount_Pom;
import pageobject.DeleteAccount_Pom;
import pageobject.LogOut_Pom;
import pageobject.Login_Pom;
import pageobject.PaymetPage_Pom;
import pageobject.Product_Pom;
import pageobject.SignUp_Pom;

public class PlaceOrder_Step14 extends Baseclass{

	Login_Pom login;
	Product_Pom product;
	CartPage_Pom cart;
	SignUp_Pom signUp;
	AccountInfo_Pom accountInfo;
	CreateAccount_Pom createAc;
	LogOut_Pom logOut;
	CheckOut_Pom checkOut;
    PaymetPage_Pom payment;
    DeleteAccount_Pom deleteAc;
    AddressDetails_Pom address;
    BillingAddress_Pom bill;

@When("User Add products to cart")
public void userAddProductsToCart() throws InterruptedException {
    login = new Login_Pom(driver);
    product = new Product_Pom(driver);
    cart = new CartPage_Pom(driver);
    signUp = new SignUp_Pom(driver);
    accountInfo = new AccountInfo_Pom(driver);
    createAc = new CreateAccount_Pom(driver);
    logOut = new LogOut_Pom(driver);
    checkOut = new CheckOut_Pom(driver);
    payment = new PaymetPage_Pom(driver);
    deleteAc = new DeleteAccount_Pom(driver);
    address = new AddressDetails_Pom(driver);
    bill = new BillingAddress_Pom(driver);
    
    jsclick(login.getProductBtn());
//    Actions actions = new Actions(driver);
//    actions.moveToElement(product.getFirstProd()).perform();  // Separate actions

    mousehover(product.getFirstProd());
    jsclick(product.getAddcartFstPrd());
    Thread.sleep(5000);
    jsclick(product.getContShopping());
    
}
@When("User should Click Cart button")
public void userShouldClickCartButton() {
	jsclick(login.getCartBtn());
}
@Then("User should Verify that cart page is displayed")
public void userShouldVerifyThatCartPageIsDisplayed() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertEquals(currentUrl,"https://automationexercise.com/view_cart");
}
@When("User Click Proceed To Checkout")
public void userClickProceedToCheckout() {
    jsclick(cart.getProceedCheckOut());
}
@When("User should Click Register or Login button")
public void userShouldClickRegisterOrLoginButton() {
    jsclick(cart.getRegisterLoginBtn());
}
@When("Fill all details in Signup and create account")
public void fillAllDetailsInSignupAndCreateAccount() {
    senddata(signUp.getName(), "MadhuArun");
    senddata(signUp.getEmail(), "madhuarun205@gmail.com");
    jsclick(signUp.getSignUpbtn());
    
    jsclick(accountInfo.getRadiobtn());
    senddata(accountInfo.getPassword(), "Lakshitha88@");
    WebElement days=accountInfo.getDays();
    Select select= new Select(days);
    select.selectByValue("26");
    WebElement months=accountInfo.getMonths();
    Select monthsl= new Select(months);
    monthsl.selectByValue("8");
    WebElement years=accountInfo.getYears();
    Select slyear = new Select(years);
    slyear.selectByValue("1995");
    jsclick(accountInfo.getCheckbox1());
    jsclick(accountInfo.getCheckbox2());
    
    senddata(accountInfo.getFstName(), "Madhu");
    senddata(accountInfo.getLstName(), "Arun");
    senddata(accountInfo.getCompany(), "Axess Technology");
    senddata(accountInfo.getAddress1(), "Street no.4,Periyar Nagar,");
    senddata(accountInfo.getAddress2(), "Velachery, Chennai-100");
    WebElement country=accountInfo.getCountry();
    Select slcountry = new Select(country);
    slcountry.selectByValue("India");
    senddata(accountInfo.getState(), "TamilNadu");
    senddata(accountInfo.getCity(), "Chennai");
    senddata(accountInfo.getZipcode(), "600100");
    senddata(accountInfo.getMobNo(), "9587463241");
    jsclick(accountInfo.getAcBtn());
    
}
@Then("User should Verify ACCOUNT CREATED! and click Continue button")
public void userShouldVerifyACCOUNTCREATEDAndClickContinueButton() {
	String text = createAc.getAcnCreatedtext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT CREATED!");
    jsclick(createAc.getContinuebtn());
}
@Then("User Verify Logged in as username at top")
public void userVerifyLoggedInAsUsernameAtTop() {
	String loggedin = logOut.getLoginUsertext().getText();
	System.out.println(loggedin);
    Assert.assertEquals(loggedin, "Logged in as MadhuArun");
}
@When("User Click Cart button")
public void userClickCartButton() {
    jsclick(login.getCartBtn());
}
@When("Click Proceed To Checkout button")
public void clickProceedToCheckoutButton() {
	jsclick(cart.getProceedCheckOut());
}
@Then("User should Verify Address Details and Review Your Order")
public void userShouldVerifyAddressDetailsAndReviewYourOrder() {
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
}
@When("User Enter description in comment text area and click Place Order")
public void userEnterDescriptionInCommentTextAreaAndClickPlaceOrder() {
    senddata(checkOut.getTextMsg(), "Quality of Product is good.");
    jsclick(checkOut.getPlaceOrder());
}
@When("User Enter payment details: Name on Card, Card Number, CVC, Expiration date")
public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
    senddata(payment.getNameOnCard(), "Madhuarun");
    senddata(payment.getCardNumber(), "6985324714758931");
    senddata(payment.getCvv(), "2857");
    senddata(payment.getExpMonth(), "10");
    senddata(payment.getExpYear(), "2026");
}
@When("User Click Pay and Confirm Order button")
public void userClickPayAndConfirmOrderButton() throws InterruptedException {
    jsclick(payment.getPayConformOrder());
    driver.navigate().back();
   // Thread.sleep(10000);
}
@Then("User should Verify success message {string}")
public void userShouldVerifySuccessMessage(String string) throws InterruptedException{
	 String pageSource = driver.getPageSource();
	Assert.assertTrue("Your order has been placed successfully!", pageSource.contains("Your order has been placed successfully!"));
	   
	jsclick(payment.getPayConformOrder());
	//Thread.sleep(5000);
}
@Then("User should Verify ACCOUNT DELETED! and click Continue button")
public void userShouldVerifyACCOUNTDELETEDAndClickContinueButton() {
	jsclick(logOut.getDeleteBtn());
	String text = deleteAc.getDeleteActext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT DELETED!");
    jsclick(deleteAc.getContinueBtn1());
}

}
