package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drag_drop {
WebDriver driver;

@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Static.html");
	driver.manage().window().maximize();
	
	WebElement from = driver.findElement(By.xpath("//img[@id='angular']"));
	
	WebElement to = driver.findElement(By.xpath("//div[@class='dragged']")); 
	//Perform drag and drop
	Actions builder = new Actions(driver);
	         builder.dragAndDrop(from, to).perform();
		
		
		
	}
@BeforeTest
public  void test()throws InterruptedException {
	// TODO Auto-generated method stub

EdgeOptions option = new EdgeOptions();
	
	option.addArguments("--remote-allow-origins*");
	
	WebDriver driver = new EdgeDriver();
	
driver.get("https://demo.automationtesting.in/Static.html");
driver.manage().window().maximize();

WebElement from = driver.findElement(By.xpath("//img[@id='angular']"));

WebElement to = driver.findElement(By.xpath("//div[@class='dragged']")); 
//Perform drag and drop
Actions builder = new Actions(driver);
         builder.dragAndDrop(from, to).perform();
	
	
	
}
@AfterTest
public void close() {
	
	driver.close();	
}

}
