package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class weblinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//System.setProperty("chromedivber.chrome.driver", "");
		
		
		EdgeOptions option = new EdgeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new EdgeDriver();
		
	driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.xpath("//a"));


		// Iterating each link and checking the response status
		for (WebElement link : links) {
		String url = link.getAttribute("href");
		System.out.println(url);
		}
		
	}

}
