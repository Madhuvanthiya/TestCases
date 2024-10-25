package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDeteail_Pom {
	
	WebDriver driver;
	
	public ProductDeteail_Pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="span input[id='quantity']")
	WebElement addQuantity;
	@FindBy(xpath="//button[@type='button']//i")
	WebElement addCart;
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]/u[1]")
	WebElement viewCart;
	@FindBy(xpath="//div[@class='product-overlay']//a//i")
	WebElement cartWinterTop;
	@FindBy(xpath="//div[@class='modal-footer']//button")
	WebElement continueshoppingBtn;
	@FindBy(xpath="//li[@class='active']//a")
	WebElement writeReview;
	@FindBy(xpath="//form[@id='review-form']//input[@id='name']")
	WebElement name;
	@FindBy(xpath="//form[@id='review-form']//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//form[@id='review-form']//textarea[@id='review']")
	WebElement addReview;
	@FindBy(xpath="//button[@id='button-review']")
	WebElement submitBtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAddQuantity() {
		return addQuantity;
	}
	public WebElement getAddCart() {
		return addCart;
	}
	public WebElement getViewCart() {
		return viewCart;
	}
	public WebElement getCartWinterTop() {
		return cartWinterTop;
	}
	public WebElement getContinueshoppingBtn() {
		return continueshoppingBtn;
	}
	public WebElement getWriteReview() {
		return writeReview;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddReview() {
		return addReview;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}




}
