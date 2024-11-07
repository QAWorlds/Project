package testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class parellel {

WebDriver driver;

@SuppressWarnings("deprecation")
@Test()
public void testOnChromeWithBrowserStackUrl() throws InterruptedException
{
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--remote-allow-origins*");
	
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	try {
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ueujdfiwjfiwjdi");
	
	Select obj = new Select(driver.findElement(By.xpath("//Select[@class='form-control ng-pristine ng-untouched ng-valid']")));
	obj.selectByVisibleText("C");
	}catch(Exception e) {
	    System.out.println("An error occurred: " + e.getMessage());
	}

}

@SuppressWarnings("deprecation")
@Test()
public void testOnChromeWithBrowserStackSignUp()
{
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--remote-allow-origins*");
	
	WebDriver driver = new ChromeDriver();
	
driver.get("https://demo.automationtesting.in/Static.html");
driver.manage().window().maximize();




WebElement fileInput = driver.findElement(By.name("uploadfile"));
fileInput.sendKeys("C:/path/to/file.jpg");
}



@AfterClass
public void close()
{
driver.close();
}
}