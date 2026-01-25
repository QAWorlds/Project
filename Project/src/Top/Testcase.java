package Top;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testcase {

	
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, IOException {
    
    	String browser = "edge";
    	
    	
    	switch(browser.toLowerCase()){
    		
    		case "chrome":
    			
    			WebDriverManager.chromedriver().setup();
    		
    		driver = new ChromeDriver();
    		
    		case "edge":
    			
    			WebDriverManager.edgedriver().setup();
    			driver = new EdgeDriver();
    		
    		 default:
    			 
    			 System.out.print("not found");
    	}
    	
    	driver.get("https://www.google.com/");
    	
    }
    
}
