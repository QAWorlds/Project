package Locatorss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
		
		Thread.sleep(5000);		
		Thread.sleep(5000);	   
		Thread.sleep(5000);	
		                   
///////// normal xpath /////////////////////////////
		
/*
		Advanced Techniques in Relative XPath:
			Using Attributes: Select elements based on specific attributes.
			Example: //input[@id='username']
			Using Text() Function: Select elements based on the text content.
			Example: //button[text()='Submit']
			Using Contains() Function: Match partial values of attributes or text.
			Example: //input[contains(@class, 'search')]
			Using Starts-with() Function: Match attributes that begin with specific characters.
			Example: //div[starts-with(@id, 'user-')]
			Using Positioning (Indexing): Select elements by their position.
			Example: (//div[@class='list-item'])[3]
		
		*/
		
		
	}

}
