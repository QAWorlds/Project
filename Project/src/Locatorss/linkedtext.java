package Locatorss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linkedtext {
	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--remote-allow-origins*");
	
	WebDriver driver = new ChromeDriver(option);
	
driver.get("https://www.globalsqa.com/cheatsheets/");
driver.manage().window().maximize();
	 Thread.sleep(5000);

	driver.findElement(By.partialLinkText("heat Sheet")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Python Beginner Cheat Sheet")).click();
	
	
}}
