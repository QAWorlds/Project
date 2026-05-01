import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown2 {
    public static void main(String[] args) {
        // Set up WebDriver (adjust path to chromedriver accordingly)
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Register.html");
   

        try {
            // Navigate to the target webpage
           // driver.get("https://www.abhibus.com/");
            
            driver.manage().window().maximize();
            Thread.sleep(5000);
////
            // Locate the dropdown element and click to open it
            WebElement dropdown = driver.findElement(By.xpath("(//Select[@type='text'])[1]"));
            Select select = new Select(dropdown);

            
            List<WebElement> optionsList = select.getOptions();
   

          
            for (WebElement option : optionsList) {
            	
            	System.out.println(option.getText());
                if (option.getText().equals("C")) {
                    option.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
           // driver.quit();
        }
    }
}
