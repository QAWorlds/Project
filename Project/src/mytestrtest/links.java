package mytestrtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
          ChromeOptions options = new ChromeOptions();


               options.addArguments("--remote-allow-origins=*");
               WebDriver driver = new ChromeDriver(options);
  
           driver.get("https://demo.automationtesting.in/Register.html");
          driver.manage().window().maximize();
  Thread.sleep(5000);
		
				
List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link: links) {
			System.out.println(link.getAttribute("href"));
	}

}}
