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
import pageobject.Product_Pom;
import pageobject.SignUp_Pom;

public class VerifyAddressCheckOut_Step23 extends Baseclass {
        SignUp_Pom signUp;
      	AccountInfo_Pom accountInfo;
    	CreateAccount_Pom createAccount;
    	LogOut_Pom logOut;
    	Login_Pom login;
    	Product_Pom product;
    	CheckOut_Pom checkOut;
        CartPage_Pom cart;
        AddressDetails_Pom address;
        BillingAddress_Pom bill;
        DeleteAccount_Pom deleteAc;

String RegisterAddress;
@When("User Fill all details in Signup and create account")
public void userFillAllDetailsInSignupAndCreateAccount(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	signUp = new SignUp_Pom(driver);
	accountInfo = new AccountInfo_Pom(driver);
	createAccount = new CreateAccount_Pom(driver);
	logOut =new LogOut_Pom(driver);
	login = new Login_Pom(driver);
    product = new Product_Pom(driver);
	checkOut= new CheckOut_Pom(driver);
    cart = new CartPage_Pom(driver);
    address = new AddressDetails_Pom(driver);
    bill = new BillingAddress_Pom(driver);
    deleteAc = new DeleteAccount_Pom(driver);
	
	jsclick(signUp.getSignUploginbtn());
	senddata(signUp.getName(), "MadhuArun");
	senddata(signUp.getEmail(), "madhuarun314@gmail.com");
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
    Thread.sleep(3000);
    
    RegisterAddress=accountInfo.getRegisterAddress();
    System.out.println(RegisterAddress);
    jsclick(accountInfo.getAcBtn());
    
    String text = createAccount.getAcnCreatedtext().getText();
    System.out.println(text);
    Assert.assertEquals(text, "ACCOUNT CREATED!");
	jsclick(createAccount.getContinuebtn());

	 String loggedin = logOut.getLoginUsertext().getText();
   	 System.out.println(loggedin);
     Assert.assertEquals(loggedin, "Logged in as MadhuArun");
     
     jsclick(login.getProductBtn());
     mousehover(product.getFirstProd());
     jsclick(product.getAddcartFstPrd());
     jsclick(product.getContShopping());
     jsclick(login.getCartBtn());
     
     String currentUrl = driver.getCurrentUrl();
 	 System.out.println(currentUrl);
 	 Assert.assertEquals(currentUrl,"https://automationexercise.com/view_cart");
 	
 	 jsclick(cart.getProceedCheckOut());
}

@Then("User should Verify that the delivery address is same address filled at the time registration of account")
public void userShouldVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() throws InterruptedException { 
 	String fltext = address.getFlname().getText();
    String cmptext = address.getCompanyname().getText();
   	String adrs1text = address.getAddress1().getText();
 	String adrs2text = address.getAddress2().getText();
 	String zipcodetext = address.getCityZipcode().getText();
	String cntrytext = address.getCountryName().getText();
	String mobiletext = address.getMobileNo().getText();	
	String addressDetail= fltext+ cmptext+ adrs1text+ adrs2text+ zipcodetext+ cntrytext+ mobiletext;
	System.out.println(addressDetail);
	String removedTitle=addressDetail.replaceFirst("^Mrs\\.\\s*", "").trim();
	System.out.println(removedTitle);

		Assert.assertEquals(removedTitle,RegisterAddress);

}
@Then("User should Verify that the billing address is same address filled at the time registration of account")
public void userShouldVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
	String bfltext = bill.getFlname().getText();
    String bcmpytext = bill.getCompanyName().getText();
    String baddrs1text = bill.getBilladdress1().getText();
    String baddr2text = bill.getBilladdress2().getText();
    String bzipcodetext = bill.getZipcode().getText();
    String bcntrytext = bill.getBillcountry().getText();
    String bmobiletext = bill.getBillmobileNo().getText();
    String billingAddress= bfltext+ bcmpytext+ baddrs1text+ baddr2text+ bzipcodetext+ bcntrytext+ bmobiletext;
    System.out.println(billingAddress);
    String removedTitle=billingAddress.replaceFirst("^Mrs\\.\\s*", "").trim();
	System.out.println(removedTitle);
	Assert.assertEquals(removedTitle,RegisterAddress);
	
	jsclick(logOut.getDeleteBtn());
	String deletedtext = deleteAc.getDeleteActext().getText();
	System.out.println(deletedtext);
	Assert.assertEquals(deletedtext, "ACCOUNT DELETED!");
	jsclick(deleteAc.getContinueBtn1());
}
}
