package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
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

}
