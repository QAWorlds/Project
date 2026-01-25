package Top;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Slider {
	
	@Test
	public void RegisterForm() {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/slider");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

	    Actions action = new Actions(driver);

	    // drag the slider 50 pixels to the right
	    action.dragAndDropBy(slider, 50, 0).perform();
	}}