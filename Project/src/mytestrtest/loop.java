package mytestrtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		

	      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	              ChromeOptions options = new ChromeOptions();


	                   options.addArguments("--remote-allow-origins=*");
	                   WebDriver driver = new ChromeDriver(options);
	      
	               driver.get("https://demo.automationtesting.in/Frames.html");
	              driver.manage().window().maximize();
	      Thread.sleep(5000);
	      
	      List<WebElement> linkss = driver.findElements(By.tagName("button"));

	        // Iterate through the list using a for loop
	        for (int i = 0; 
	        		
	        		i < linkss.size(); i++) {
	            WebElement link = linkss.get(i);
	            System.out.println("Link Text: " + link.getText());
	        }

	        //driver.quit();
	    }
	
	      
	}


