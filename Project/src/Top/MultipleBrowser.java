package Top;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {
    public static WebDriver driver;

    public static void main(String[] args) {
        String browser = "edge"; // Change this value to "firefox" or "edge"

        // Initialize WebDriver based on browser choice
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser specified.");
                System.exit(0);
        }

        // Open URL and perform test
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
      //  driver.quit();
    }
}
