package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class loop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
        ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.globalsqa.com/samplepagetest/#google_vignette");
	      driver.manage().window().maximize();
		 Thread.sleep(5000);
	

		
		}
		
		
		
		
	}
