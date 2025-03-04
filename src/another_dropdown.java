import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class another_dropdown {
    public static void main(String[] args) throws InterruptedException {
        // Set up the WebDriver
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/r.php?entry_point=login");
       driver.manage().window().maximize();
Thread.sleep(5000);

        try {
            // Navigate to the webpage with the dropdown
     

            // Locate the dropdown element
            WebElement dropdown = driver.findElement(By.cssSelector("select#month"));

            // Click to open the dropdown (if necessary)
            dropdown.click();

            // Locate all options in the dropdown
            List<WebElement> optionss = driver.findElements(By.cssSelector("select#month"));
//System.out.println(optionss);
            // Iterate through the options and select the desired one
            String valueToSelect = "Jan";
            for (WebElement option : optionss) {System.out.println(option);
            	
                if (option.getText().equals(valueToSelect)) {
                    option.click(); // Select the option
                    break; // Exit loop once the desired option is selected
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
