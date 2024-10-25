package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Pom {
	WebDriver driver;
	
	public CheckOut_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr[@id='product-1']//td[@class='cart_description']")
	WebElement prod1;
	@FindBy(xpath="//tr[@id='product-2']//td[@class='cart_description']")
	WebElement prod2;
	@FindBy(xpath="//tr[@id='product-1']//td[@class='cart_price']//p")
	WebElement prod1Price;
	@FindBy(xpath="//tr[@id='product-1']//td[@class='cart_quantity']//button")
	WebElement quantity1;
	@FindBy(xpath="//tr[@id='product-1']//td[@class='cart_total']//p")
	WebElement totalProd1;
	@FindBy(xpath="//tr[@id='product-2']//td[@class='cart_price']//p")
	WebElement prod2Price;
	@FindBy(xpath="//tr[@id='product-2']//td[@class='cart_quantity']//button")
	WebElement quantity2;
	@FindBy(xpath="//tr[@id='product-2']//td[@class='cart_total']//p")
	WebElement totalProd2;
	@FindBy(xpath="//tr[@id='product-11']//td[@class='cart_quantity']//button")
	WebElement quqntity11;
	@FindBy(xpath="//div[@id='cart_info']")
	WebElement cartInfo;
	@FindBy(css="ul[id='address_delivery']")
	WebElement deliveryAddress;
	@FindBy(css="ul[id='address_invoice']")
	WebElement invoiceAddress;
	@FindBy(xpath="//tr[@id='product-1']")
	WebElement cartInfo1;
	@FindBy(css="textarea[class='form-control']")
	WebElement textMsg;
	@FindBy(xpath="//div//a[@class='btn btn-default check_out']")
	WebElement placeOrder;
	@FindBy(xpath="//span[@id='empty_cart']//p//b")
	WebElement emptyCart;
	
	
	public WebElement getEmptyCart() {
		return emptyCart;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProd1() {
		return prod1;
	}
	public WebElement getProd2() {
		return prod2;
	}
	public WebElement getProd1Price() {
		return prod1Price;
	}
	public WebElement getQuantity1() {
		return quantity1;
	}
	public WebElement getTotalProd1() {
		return totalProd1;
	}
	public WebElement getProd2Price() {
		return prod2Price;
	}
	public WebElement getQuantity2() {
		return quantity2;
	}
	public WebElement getTotalProd2() {
		return totalProd2;
	}
	public WebElement getQuqntity11() {
		return quqntity11;
	}
	public WebElement getCartInfo() {
		return cartInfo;
	}
	public WebElement getDeliveryAddress() {
		return deliveryAddress;
	}
	public WebElement getInvoiceAddress() {
		return invoiceAddress;
	}
	public WebElement getCartInfo1() {
		return cartInfo1;
	}
	public WebElement getTextMsg() {
		return textMsg;
	}
	public WebElement getPlaceOrder() {
		return placeOrder;
	}


	

}
