package stepdefinition;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import factory.Baseclass;
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

public class DownloadInvoice_Step24 extends Baseclass {
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
    
    private static final String DOWNLOAD_DIR = System.getProperty("user.home") + "/Downloads/";
    private String invoiceFileName = "invoice.txt";  // Example file name  "C:\Users\arunn\Downloads\invoice.txt"

@When("User Click Register or Login button")
public void userClickRegisterOrLoginButton() throws InterruptedException {
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
    mousehover(product.getFirstProd());
    jsclick(product.getAddcartFstPrd());
    Thread.sleep(3000);
    jsclick(product.getContShopping());

    jsclick(login.getCartBtn());
    
    String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertEquals(currentUrl,"https://automationexercise.com/view_cart");
    jsclick(cart.getProceedCheckOut());
    jsclick(cart.getRegisterLoginBtn());	

}
@When("User should Fill all details in Signup and create account")
public void userShouldFillAllDetailsInSignupAndCreateAccount() {
	senddata(signUp.getName(), "MadhuArun");
    senddata(signUp.getEmail(), "madhuarun210@gmail.com");
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
    
    String text = createAc.getAcnCreatedtext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT CREATED!");
    jsclick(createAc.getContinuebtn());
    
    String loggedin = logOut.getLoginUsertext().getText();
	System.out.println(loggedin);
    Assert.assertEquals(loggedin, "Logged in as MadhuArun");
    jsclick(login.getCartBtn());
}
@When("User should Click Proceed To Checkout button")
public void userShouldClickProceedToCheckoutButton() {
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
}
@When("User Click Download Invoice button and verify invoice is downloaded successfully.")
public void userClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
	jsclick(payment.getDownload());
	Path filePath = Paths.get(DOWNLOAD_DIR + invoiceFileName);
	// Verify if the invoice file is present in the download directory
    if (Files.exists(filePath)) {
        System.out.println("Invoice downloaded successfully: " + invoiceFileName);
    } else {
        throw new RuntimeException("Invoice file not found: " + invoiceFileName);
    }
}
@When("User should Click Continue button")
public void userShouldClickContinueButton() {
   jsclick(payment.getContinueBtn());
}
@When("User should Click Delete Account button")
public void userShouldClickDeleteAccountButton() {
	jsclick(logOut.getDeleteBtn());
	String text = deleteAc.getDeleteActext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT DELETED!");
    jsclick(deleteAc.getContinueBtn1());
}


}
