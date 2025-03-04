package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class dropdown2 {
    public static void main(String[] args) {
        // Set up the WebDriver

		ChromeOptions option = new ChromeOptions();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
			option.addArguments("--remote-allow-origins*");
			

			
			WebDriver driver = new ChromeDriver();
		//	WebDriver driver = new ChromeDriver();
 
            // Open the target page
            driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
          


            WebElement dropdown = driver.findElement(By.xpath("//Select[@id='Skills']"));
            dropdown.click();

            // Find all options within the dropdown
            List<WebElement> options = driver.findElements(By.xpath("//Select[@id='Skills']/option"));

       
            for (WebElement optionss : options) {
            	
            	System.out.println(optionss);
                if (optionss.getText().equals("C")) {
                    optionss.click();
                   
                }
            }}}

   