package Top;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_and_Drop {

@Test

	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Static.html");
	
	 
	    
	
	
	
    // Wait until the element is visible used for specific condition 

	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//img[@id='angular']")));
	WebElement from = driver.findElement(By.xpath("//img[@id='angular']"));
	
	WebElement to = driver.findElement(By.xpath("//div[@class='dragged']")); 
	//Perform drag and drop
	Actions builder = new Actions(driver);
	         builder.dragAndDrop(from, to).perform();
		
		
		  
	         
	           
	         
	         
		
		
	}


}
