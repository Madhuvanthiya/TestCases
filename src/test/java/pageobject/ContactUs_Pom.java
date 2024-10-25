package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs_Pom {
	
	 WebDriver driver;
		
	 public ContactUs_Pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	 
	
	@FindBy(xpath="//div[@class='contact-form']//h2[@class='title text-center']")
	 WebElement getInTouchText;
	 @FindBy(xpath="//form[@id='contact-us-form']//div[1]//input[@placeholder='Name']")
	 WebElement name;
	 @FindBy(xpath="//form[@id='contact-us-form']//div[2]//input[@placeholder='Email']")
	 WebElement email;
	 @FindBy(xpath="//form[@id='contact-us-form']//div[3]//input[@placeholder='Subject']")
	 WebElement subject;
	 @FindBy(xpath="//form[@id='contact-us-form']//div[4]//textarea[@placeholder='Your Message Here']")
	 WebElement msgArea;
	 @FindBy(xpath="//form[@id='contact-us-form']//div[5]//input[@class= 'form-control']")
	 WebElement uploadfile;
	 @FindBy(xpath="//form[@id='contact-us-form']//div[6]//input[@class= 'btn btn-primary pull-left submit_form']")
	 WebElement submitBtn;
	 @FindBy(css="div[class='status alert alert-success']")
	 WebElement successMsg;
	 @FindBy(css="div[id='form-section'] a")
	 WebElement homeBtn;
	    public WebDriver getDriver() {
			return driver;
		}
		public WebElement getGetInTouchText() {
			return getInTouchText;
		}
		public WebElement getName() {
			return name;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getSubject() {
			return subject;
		}
		public WebElement getMsgArea() {
			return msgArea;
		}
		public WebElement getUploadfile() {
			return uploadfile;
		}
		public WebElement getSubmitBtn() {
			return submitBtn;
		}
		public WebElement getSuccessMsg() {
			return successMsg;
		}
		public WebElement getHomeBtn() {
			return homeBtn;
		}





}
