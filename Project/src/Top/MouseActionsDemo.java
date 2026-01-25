package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions actions = new Actions(driver);

        // 1. Right-click on element
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightClickBtn).perform();
        Thread.sleep(2000); // Wait to observe

        // 2. Double-click on button
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickBtn).perform();
        Thread.sleep(2000); // Wait to observe
        driver.switchTo().alert().accept(); // Handle alert

        // 3. Mouse hover example (using another page with hover effect)
        driver.get("https://demo.opencart.com/");
        WebElement desktopsMenu = driver.findElement(By.linkText("Desktops"));
        actions.moveToElement(desktopsMenu).perform();
        Thread.sleep(2000); // Hover effect visible
        
       // Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).perform();  // Scroll down
        
        actions.sendKeys(Keys.PAGE_UP).perform();  // Scroll up


        driver.quit();
    }
}
