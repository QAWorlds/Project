package Top;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	
	//implicitywaits
	
	  public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        
	        
	        
	        
	      //implicitywaits 
	        
	       /* What it is:

	        	A global wait applied to all elements.
	        	Selenium will keep trying until the element is found or timeout finishes.

	        	When to use:

	        	✔ Simple apps
	        	✔ All elements load almost at same speed
	        	✔ Apply only one time in entire framework*/
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        
	        //Explicit Wait

/*What it is:

A condition-based wait only for a specific element.

When to use:

✔ Dynamic elements
✔ Buttons that take time to enable
✔ Visibility, Clickable, Presence, Text-based waits
✔ Most used in real-time projects

Syntax:*/
	        
	        
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));

	  //Fluent Wait
/*What it is:

An advanced version of Explicit wait with custom:

Timeout

Polling interval

Exception handling

When to use:

✔ Sudden pop-ups
✔ Price updates
✔ OTP fields
✔ Auto-suggest dropdown
✔ Elements that appear at random timings*/
Wait<WebDriver> waits = new FluentWait<>(driver)
.withTimeout(Duration.ofSeconds(20))
.pollingEvery(Duration.ofSeconds(2))
.ignoring(NoSuchElementException.class);

wait.until(ExpectedConditions.elementToBeClickable(By.id("close-popup")));
/*
“Implicit wait is set once globally for all elements. Explicit wait is used only for specific elements with conditions like visibility or clickability. 
Fluent wait is an advanced explicit wait where we can set custom polling time and ignore exceptions, useful for unpredictable elements or sudden pop-ups.”
	*/  
	  }}