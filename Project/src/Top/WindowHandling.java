package Top;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(option);

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        String mainWindow = driver.getWindowHandle();

        // Open a new window using JavaScript (or click a link that opens in new tab/window)
        ((JavascriptExecutor) driver).executeScript("window.open('https://demo.automationtesting.in/Index.html','_blank');");

        Thread.sleep(3000);

        Set<String> allWindows = driver.getWindowHandles();

        // Iterate and switch to new window
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new window: " + driver.getTitle());

                // Perform actions in the new window
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Selenium");
                Thread.sleep(3000);

                break;
            }
        }

        // Switch back to the main window
        driver.switchTo().window(mainWindow);
        System.out.println("Switched back to main window: " + driver.getTitle());

        // Optional: close the browser
        driver.quit();
    }
}
