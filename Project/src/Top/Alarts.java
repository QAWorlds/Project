package Top;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alarts {

	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Static.html");
	
	 // Switch to alert
    Alert alert = driver.switchTo().alert();
    
    driver.switchTo().alert().accept();

    // Accept (OK) the alert
    alert.accept();

    // If it's a confirmation box (OK/Cancel)
    // alert.dismiss(); // Click Cancel

    // If it's a prompt with an input field
    // alert.sendKeys("Test input");
    // alert.accept();
	
	
}}
