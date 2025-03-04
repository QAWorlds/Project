package mytestrtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//aravind

public class dropdown {
	
@Test
	public void setup() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Register.html");
       driver.manage().window().maximize();
Thread.sleep(5000);
	}

	public void dropdown() throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
      Select objselect = new Select(driver.findElement(By.xpath("(//Select[@type='text'])[1]")));
      objselect.selectByVisibleText("C");
      Thread.sleep(2000);
	driver.findElement(By.id("firstpssword")).sendKeys("aravind");
}
	
	}






   



