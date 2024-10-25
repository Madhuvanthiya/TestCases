package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProd_Pom {
	
WebDriver driver;
	
	public SearchProd_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='features_items']//h2[text()='Searched Products']")
	WebElement searchprodText;
	@FindBy(xpath="//div[@class='features_items']")
	WebElement prodItems;
	@FindBy(xpath="(//div[@class='panel-heading']//h4//a//span//i)[1]")
	WebElement women;
	@FindBy(xpath="//div[@id='Women']//div//ul//li[2]//a")
	WebElement tops;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSearchprodText() {
		return searchprodText;
	}
	public WebElement getProdItems() {
		return prodItems;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getTops() {
		return tops;
	}


}
