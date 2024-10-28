package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class choose_file {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	
	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
	fileInput.sendKeys("C:\\aravind/Screenshot_1.png");
}
}