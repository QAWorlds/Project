package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
		
			String web = driver.findElement(By.xpath(null)).getText();
			
			
			WebElement webs = driver.findElement(By.xpath(web)) ;
			
		
		webs.click();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
		    System.out.println(link.getAttribute("href"));
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
