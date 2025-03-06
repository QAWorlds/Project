package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MouseHoverClick {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

   	 ChromeOptions option = new ChromeOptions();
   	 		
   	 		option.addArguments("--remote-allow-origins*");
   	 		
   	 		WebDriver driver = new ChromeDriver();
   	 		
   	 	driver.get("https://demo.automationtesting.in/Register.html");
   	 	 driver.manage().window().maximize();
   	 	Thread.sleep(5000);
   	 	
   	 	
        // Locate the main menu item
        WebElement menu = driver.findElement(By.xpath("//a[text()='SwitchTo']")); // Replace with actual XPath
        //Thread.sleep(5000);
        // Locate the submenu item
        WebElement submenu = driver.findElement(By.xpath("//a[text()='Alerts']")); // Replace with actual XPath

        // Create Actions class instance
        Actions actions = new Actions(driver);

        // Perform hover action
        actions.moveToElement(menu).perform();
        Thread.sleep(5000);
        // Click on the submenu item
        submenu.click();

        // Close the browser
        //driver.quit();
    }
}
