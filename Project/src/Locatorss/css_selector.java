package Locatorss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
		 
	
	
	
	
	
	
	
	/*
	  
	  css selector
	  
	 ===== For ID =======
	  
	  
	  driver.findElement(By.cssSelector(“<tagname>#<id value>”));
	  
	  driver.findElement(By.cssSelector(“#<id value>”));
	  
	  
	  driver.findElement(By.cssSelector(“<tagname>[id=’<id value>’]”));
	  
	  
	  
	  ====== For Class ==========
	  
	 driver.findElement(By.cssSelector(“<tagname>.<class value>”));
	 
	 driver.findElement(By.cssSelector(“.<class value>”));
	 
	 driver.findElement(By.cssSelector(“<tagname>[class=’<class value>’]”));
	  
	  
	  ======= For attribute ==========
	  
	  
	  
	  
	  
	  
	  */
	}

}
