package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Dynamic_Dropdowns {
    public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Register.html");
       driver.manage().window().maximize();
Thread.sleep(5000);
	
        driver.findElement(By.id("Skills")).click();

        // Wait for options to appear (Explicit Wait can be used)
        Thread.sleep(2000); // Replace with WebDriverWait for better stability

        // Get all options
        List<WebElement> optionss = driver.findElements(By.xpath("//Select[@id='Skills']/option"));

        // Loop through options to select "Option 3"
        for (WebElement option : optionss) {
            if (option.getText().equals("C")) {
                option.click();
                break;
            }
        }

       // driver.quit();  
    }
}
    

