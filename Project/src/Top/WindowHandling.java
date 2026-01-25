package Top;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        // Get the main window handle
        String mainWindow = driver.getWindowHandle();
        
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        
        
        // Click the button to open a new tab
      WebElement tab =   driver.findElement(By.id("windowButton"));
      
      actions.scrollToElement(tab).perform();
      //driver.navigate().refresh();

      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      tab.click();
      
      
      
      
        Thread.sleep(3000); // Give it time to open the tab

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new window/tab: " + driver.getTitle());
                System.out.println("Text from new tab: " + driver.findElement(By.id("sampleHeading")).getText());
                Thread.sleep(5000);
               
                
                driver.close();
            }
        }

        driver.switchTo().window(mainWindow);
        System.out.println("Back to main tab: " + driver.getTitle());
        Thread.sleep(5000);
       // driver.quit();
    }
}
