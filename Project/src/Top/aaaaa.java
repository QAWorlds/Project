package Top;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aaaaa {
	
	
	@Test
    public  void test() throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
       driver.get("https://testautomationpractice.blogspot.com/");
       
       
     String CurrentWindow = driver.getWindowHandle();
     
     //driver.findElement(By.xpath("//button[@id='PopUp']")).click();
     
     driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
     Set<String> allwindows = driver.getWindowHandles();
     
     
     for(String window : allwindows) {
    	 if(!window.equals(CurrentWindow)) {
    		 
    		 driver.switchTo().window(window);
    		 
    		 
    		 System.out.println(driver.getCurrentUrl());
    		 Thread.sleep(5000);
    		 driver.close();
    	 }
     }
	
	
	//driver.switchTo().window(CurrentWindow);
	
	
	}}
   

