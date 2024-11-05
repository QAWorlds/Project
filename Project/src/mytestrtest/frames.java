package mytestrtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    //  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	              ChromeOptions options = new ChromeOptions();


	                   options.addArguments("--remote-allow-origins=*");
	                   WebDriver driver = new ChromeDriver(options);
	      
	               driver.get("https://demo.automationtesting.in/Frames.html");
	              driver.manage().window().maximize();
	      Thread.sleep(5000);
	      
	      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
	      
	      driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hello");
	      
	      driver.switchTo().defaultContent();
	      
	}

}
