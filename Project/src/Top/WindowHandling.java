package Top;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Windows.html");

        String parent = driver.getWindowHandle();

        // Click button to open new window
        driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();

        // Get all windows
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window); // switch to child
                System.out.println(driver.getTitle());
                driver.close(); // close child window
            }
        }

        // Switch back to parent
        driver.switchTo().window(parent);
        System.out.println("Back to Parent");

        driver.quit();
    }
}