package factory;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class Baseclass {
	
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions act;
	
	public void openbrowser() {
		driver = new EdgeDriver();
	}
	public void maxbrowser() {
		driver.manage().window().maximize();
	}
	public void fetchurl(String url) {
		driver.get(url);
	}
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void clickbutton(WebElement element) {
		element.click();
	}
	public void jsclick(WebElement element) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void scrolldown(WebElement element) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void scrollcertainAmount() {
		js=(JavascriptExecutor) driver;
		js.executeScript("Window.scrollBy(0,400);");

	}
	public void scrollBottom() {
	    js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void scrollUp() {
		 js = (JavascriptExecutor) driver;
	   	 js.executeScript("window.scrollTo(0,0)");
	}
	public void alertOk() {
		Alert alt=driver.switchTo().alert(); 
		alt.accept();
	}
    public String generateRandomString() {
	        int length = 10;
	        String alphabet = "abcdefghijklmnopqrstuvwxyz";
	        Random random = new Random();
	        StringBuilder result = new StringBuilder(length);
	        
	        for (int i = 0; i < length; i++) {
	            result.append(alphabet.charAt(random.nextInt(alphabet.length())));
	        }
	        
	        return result.toString();
	    }
	
	public void senddata(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void mousehover(WebElement element) {
		act= new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	public void quitbrowser() {
		driver.quit();
	}

	}
	
	
	
	


