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
            driver.get("https://demo.automationtesting.in/Static.html"); // ✅ Replace with your target URL
            driver.manage().window().maximize();

            // Get all <a> and <img> tags
            List<WebElement> allElements = driver.findElements(By.xpath("//a[@href] | //img[@src]"));

            System.out.println("Total links and images found: " + allElements.size());

            for (WebElement element : allElements) {
                String url = element.getTagName().equals("a") ? element.getAttribute("href") : element.getAttribute("src");

                // Validate the URL is not null or empty
                if (url == null || url.isEmpty()) {
                    System.out.println("🔸 URL is empty for element: " + element.getTagName());
                    continue;
                }

                // Check for broken link
                verifyLink(url);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Close the browser
        }
    }

    // Method to verify links by sending an HTTP request
    public static void verifyLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

            httpConn.setConnectTimeout(5000); // Timeout in milliseconds
            httpConn.connect();

            int responseCode = httpConn.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("❌ Broken Link: " + linkUrl + " ---> HTTP Response Code: " + responseCode);
            } else {
                System.out.println("✅ Valid Link: " + linkUrl + " ---> HTTP Response Code: " + responseCode);
            }

        } catch (Exception e) {
            System.out.println("⚠️ Error checking link: " + linkUrl + " ---> " + e.getMessage());
        }
    }
}
