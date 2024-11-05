package mytestrtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
              ChromeOptions options = new ChromeOptions();


                   options.addArguments("--remote-allow-origins=*");
                   WebDriver driver = new ChromeDriver(options);
      
               driver.get("https://demo.automationtesting.in/Register.html");
              driver.manage().window().maximize();
      Thread.sleep(5000);
	
      Select objselect = new Select(driver.findElement(By.xpath("(//Select[@type='text'])[1]")));
      objselect.selectByVisibleText("C");
      Thread.sleep(2000);
	driver.findElement(By.id("firstpassword")).sendKeys("aravind");
	
}
}