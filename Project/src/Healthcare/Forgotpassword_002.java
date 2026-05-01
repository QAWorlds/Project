package Healthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forgotpassword_002 {
	@Test(enabled = false)
	public static void maih() {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://logon.gehealthcare.com/");
		
		
		//Thread.sleep("2000");
		
		driver.findElement(By.xpath("//a[@class='forgotPass']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("test@gmail.com");
		
		
				
				driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
				
				driver.quit();

	}

}
