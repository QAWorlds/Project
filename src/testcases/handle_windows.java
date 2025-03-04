package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class handle_windows {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.manage().window().maximize();

        System.out.println("Main window title: " + driver.getTitle());

        // Get the main window handle
        String mainWindowHandle = driver.getWindowHandle();

        // Locate the link element
        WebElement homeLink = driver.findElement(By.linkText("Home"));

        // Use JavaScript to open the link in a new tab
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", homeLink.getAttribute("href"));

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        Thread.sleep(5000);

        // Switch to the new window
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Perform actions in the new window
        System.out.println("New window title: " + driver.getTitle());

        // Close the new window
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        System.out.println("Switched back to main window title: " + driver.getTitle());

     
    }
}
