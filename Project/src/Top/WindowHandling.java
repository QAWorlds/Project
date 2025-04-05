package Top;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

   	 ChromeOptions option = new ChromeOptions();
   	 		
   	 		option.addArguments("--remote-allow-origins*");
   	 		
   	 		WebDriver driver = new ChromeDriver();
   	 		
   	 	driver.get("https://demo.automationtesting.in/Register.html");
   	 	 driver.manage().window().maximize();
   	 	Thread.sleep(5000);
   	 	
   	 	
   	 String mainWindow = driver.getWindowHandle();

     // Click a link that opens a new window
     driver.findElement(By.xpath("//a[text()='Home']"));

     // Get all window handles
     Set<String> allWindows = driver.getWindowHandles();

     // Iterate and switch to new window
     for (String window : allWindows) {
         if (!window.equals(mainWindow)) {
             driver.switchTo().window(window);
             System.out.println("Switched to new window: " + driver.getTitle());
             break;
         }
     }

     // Perform actions in the new window
     driver.findElement(By.cssSelector("input#email")).sendKeys("Selenium");

     // Switch back to the main window
     driver.switchTo().window(mainWindow);
     System.out.println("Switched back to main window: " + driver.getTitle());

    // driver.quit();
 }
}