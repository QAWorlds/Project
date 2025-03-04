package Top;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot_Capture {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
	driver.get("https://www.oxo.com");
	driver.manage().window().maximize();
	
	
	Thread.sleep(5000);
	
	File snapshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	
	
	FileUtils.copyFile(snapshot, new File("C:\\Users\\Aravind\\git\\Project\\Project\\Aravind.png"));

	driver.switchTo().alert().accept();
	
	 
	
	  
	
	
	
	}
}