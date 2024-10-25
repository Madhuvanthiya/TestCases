package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Pom {
	
WebDriver driver;
	
	public Product_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[@class='title text-center']")
	WebElement allProductText;
	@FindBy(xpath="(//div[@class='choose']//ul//li//a//i)[1]")
	WebElement viewprod1;
	@FindBy(xpath="//div[@class='product-information']")
	WebElement prodInfo;
	@FindBy(xpath="//input[@id='search_product'][@placeholder='Search Product']")
	WebElement searchprodField;
	@FindBy(xpath="//button[@id='submit_search']")
	WebElement searchSubmitBtn;
	@FindBy(xpath="(//div[@class='single-products']//div[@class='productinfo text-center']//p)[1]")
	WebElement firstProd;
	@FindBy(xpath="(//div[@class='single-products']//div[@class='productinfo text-center']//a//i)[1]")
	WebElement addcartFstPrd;
	@FindBy(xpath="//div[@class='modal-footer']//button[@class='btn btn-success close-modal btn-block']")
	WebElement contShopping;
	@FindBy(xpath="(//div[@class='single-products']//div[@class='productinfo text-center']//p)[2]")
	WebElement secondPrd;
	@FindBy(xpath="(//div[@class='single-products']//div[@class='productinfo text-center']//a//i)[2]")
	WebElement addSecondProd;
	@FindBy(xpath="//p[@class='text-center']//a//u")
	WebElement viewcart;
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement viewProduct;
	@FindBy(css="h2[class='title text-center']")
	WebElement womenTopsprod;
	@FindBy(xpath="(//div[@class='panel-heading']//h4//a//span//i)[2]")
	WebElement mens;
	@FindBy(xpath="//div[@id='Men']//div//ul//li[1]//a")
	WebElement tshirts;
	@FindBy(css="h2[class='title text-center']")
	WebElement mensTshirtprod;
	@FindBy(css="div[class='brands_products']")
	WebElement brands;
	@FindBy(xpath="//div[@class='brands-name']//ul//li[2]//a")
	WebElement handm;
	@FindBy(xpath="//h2[@class='title text-center']")
	WebElement brandHandM;
	@FindBy(xpath="//div[@class='brands-name']//ul//li[5]//a")
	WebElement babyHug;
	@FindBy(xpath="//h2[@class='title text-center']")////h2[@class='title text-center']//a"
	WebElement babyHugProd;
	@FindBy(xpath="//div[@class='overlay-content']//p")
	WebElement winterTop;

	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAllProductText() {
		return allProductText;
	}
	public WebElement getViewprod1() {
		return viewprod1;
	}
	public WebElement getProdInfo() {
		return prodInfo;
	}
	public WebElement getSearchprodField() {
		return searchprodField;
	}
	public WebElement getSearchSubmitBtn() {
		return searchSubmitBtn;
	}
	public WebElement getFirstProd() {
		return firstProd;
	}
	public WebElement getAddcartFstPrd() {
		return addcartFstPrd;
	}
	public WebElement getContShopping() {
		return contShopping;
	}
	public WebElement getSecondPrd() {
		return secondPrd;
	}
	public WebElement getAddSecondProd() {
		return addSecondProd;
	}
	public WebElement getViewcart() {
		return viewcart;
	}
	public WebElement getViewProduct() {
		return viewProduct;
	}
	public WebElement getWomenTopsprod() {
		return womenTopsprod;
	}
	public WebElement getMens() {
		return mens;
	}
	public WebElement getTshirts() {
		return tshirts;
	}
	public WebElement getMensTshirtprod() {
		return mensTshirtprod;
	}
	public WebElement getBabyHugProd() {
		return babyHugProd;
	}
	public WebElement getBrands() {
		return brands;
	}
	public WebElement getHandm() {
		return handm;
	}
	public WebElement getBrandHandM() {
		return brandHandM;
	}
	public WebElement getBabyHug() {
		return babyHug;
	}
	public WebElement getWinterTop() {
		return winterTop;
	}



}
