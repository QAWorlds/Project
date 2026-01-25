package Healthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_001 {
@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://logon.gehealthcare.com/");
		
		
		//Thread.sleep("2000");
		
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test@gmail.com");



driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");


driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.quit();
	}

}
