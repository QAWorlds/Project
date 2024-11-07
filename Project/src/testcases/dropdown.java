package testcases;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdown {
	WebDriver driver;
	
	@Test
public  void googlr()  throws InterruptedException {
		// TODO Auto-generated method stub

	
		ChromeOptions option = new ChromeOptions();
			
			option.addArguments("--remote-allow-origins*");
			

			
			WebDriver driver = new ChromeDriver();
		//	WebDriver driver = new ChromeDriver();
			
		    driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ueujdfiwjfiwjdi");
			
			
			WebElement text = driver.findElement(By.xpath("//Select[@class='form-control ng-pristine ng-untouched ng-valid']"));
			Select object = new Select(text);
			object.selectByVisibleText("Troubleshooting");
			List<WebElement> optionss = object.getOptions();
			for(int i = 0; i < optionss.size(); i++) {
				if(i%2!=0)
				{
			System.out.println(optionss.get(i).getText());
				
				}}}
			@AfterTest
			public void close() {
				
				driver.quit();
			}
			
	
		/*	
			
			Select obj = new Select(driver.findElement(By.xpath("//Select[@class='form-control ng-pristine ng-untouched ng-valid']")));
			obj.selectByVisibleText("C");
			
			System.out.println(obj);
			
			    
			    public class dropdown {
			    */
	
	public class dropdownn {
			@Test
			public void test() throws InterruptedException {
				
				
				
				EdgeOptions options = new EdgeOptions();
				
				options.addArguments("--remote-allow-origins*");
				WebDriver driver = new EdgeDriver();
				//	WebDriver driver = new ChromeDriver();
					
				    driver.get("https://demo.automationtesting.in/Register.html");
					driver.manage().window().maximize();
					
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ueujdfiwjfiwjdi");
					
					
					WebElement text = driver.findElement(By.xpath("//Select[@class='form-control ng-pristine ng-untouched ng-valid']"));
					Select object = new Select(text);
					object.selectByVisibleText("Troubleshooting");
					List<WebElement> optionss = object.getOptions();
					for(int i = 0; i < optionss.size(); i++) {
						if(i%2!=0)
						{
					System.out.println(optionss.get(i).getText());
				
				
			}
			
					}}}
}