package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions option = new ChromeOptions();
			
			option.addArguments("--remote-allow-origins*");
			
			WebDriver driver = new ChromeDriver();
			
		driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ueujdfiwjfiwjdi");
			
			Select obj = new Select(driver.findElement(By.xpath("//Select[@class='form-control ng-pristine ng-untouched ng-valid']")));
			obj.selectByVisibleText("C");
		
		
	}

}
