package Top;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksChecker {

    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open the target webpage
            driver.get("https://demo.automationtesting.in/Static.html"); // âœ… Replace with your target URL
            driver.manage().window().maximize();

            // Get all <a> and <img> tags
            List<WebElement> list = driver.findElements(By.tagName("a"));
            for (WebElement link : list) {
                String url = link.getAttribute("href");

                if (url == null || url.trim().isEmpty()) {
                    System.out.println("Broken/Empty link text: \"" + link.getText() + "\" - HREF is missing or empty.");
                } else if (url.startsWith("javascript") || url.startsWith("#")) {
                    System.out.println("Non-functional link: " + url + " (skipped)");
                } else {
                   // System.out.println("Valid looking link: " + url);
                }
            }

        } finally {
            driver.quit();
        }
    }
}