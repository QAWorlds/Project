package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.oxo.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//Locator = ID
	 
		/*	<button id="submitbtn" type="submit" class="btn btn-primary" name="signup" 
			value="sign up"> Submit </button>*/
		
		//driver.findElement(By.id("submitbtn"));
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		//Locator = Name
		
		/*	<button id="submitbtn" type="submit" class="btn btn-primary" name="signup" 
		value="sign up"> Submit </button>*/
		//driver.findElement(By.name("signup"));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//Locator = Tagname
		/*	<button id="submitbtn" type="submit" class="btn btn-primary" name="signup" 
		value="sign up"> Submit </button>*/
		
		//WebElement footer = driver.findElement(By.tagName("div"));
		//System.out.println(footer.getText()); 
		
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Locator = Tagname
				/*	<button id="submitbtn" type="submit" class="btn btn-primary" name="signup" 
				value="sign up"> Submit </button>*/
				
		
		WebElement signUpLink = driver.findElement(By.linkText("chefs-in-residence"));
		signUpLink.click();
		
	}

}
