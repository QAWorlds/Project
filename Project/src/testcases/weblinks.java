package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class weblinks {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		
		
		//System.setProperty("chromedivber.chrome.driver", "");
		
		
		EdgeOptions option = new EdgeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new EdgeDriver();
		
	driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		/*
		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		// Iterating each link and checking the response status
		for (WebElement link : links) {
		String url = link.getAttribute("href");
		System.out.println(url);*/
		
		
		List<WebElement> web = driver.findElements(By.tagName("a"));
		for(WebElement links : web) {
		String url = links.getAttribute("href");
		System.out.println(url);
		}
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
		
	}


