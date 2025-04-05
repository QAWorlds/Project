package Top;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
@Test
public class Alarts {

	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	
			
			driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	
	 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	 // Switch to alert
   Alert alert = driver.switchTo().alert();
    
  //  driver.switchTo().alert().accept();
Thread.sleep(5000);
    // Accept (OK) the alert
    alert.sendKeys("aravind");

    // If it's a confirmation box (OK/Cancel)
    // alert.dismiss(); // Click Cancel

    // If it's a prompt with an input field
    // alert.sendKeys("Test input");
    // alert.accept();
	
	
}}
