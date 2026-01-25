package Top;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class calender {
	
	@Test
	public void RegisterForm() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	//	driver.get("https://demoqa.com/date-picker");
		driver.get("https://www.makemytrip.com/bus-tickets/");

		driver.findElement(By.id("travelDate")).click();
	
	driver.findElement(By.xpath("//div[contains(@aria-label,'Mon Mar 02 2026')]")).click();
	}}
