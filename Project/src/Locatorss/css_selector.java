package Locatorss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.globalsqa.com/samplepagetest/#google_vignette");
	driver.manage().window().maximize();
		 Thread.sleep(5000);
	
/*	for id */
		 try {
		 try {
		 driver.findElement(By.cssSelector("input#g2599-name")).sendKeys("aravind");
	
	/* for class*/
		 
		 driver.findElement(By.cssSelector("input.email")).sendKeys("test@gmail.com");
		 
		 
/* for any*/
		 
		 driver.findElement(By.cssSelector("input[type='url']")).sendKeys("www.google.com");
		 
		 Select obj = new Select(driver.findElement(By.cssSelector("Select[class^='select']")));
		 obj.selectByValue("1-3");
		 
				 
				 driver.findElement(By.cssSelector("input[value^='Automation Testing'")).click();
				 
				
						 
						 driver.findElement(By.cssSelector(" button[onclick='myFunction()']")).click();
				
	driver.switchTo().alert().dismiss();
	
		 }catch
		 (Exception e) {driver.getCurrentUrl().equals("samplepagetest");}
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
