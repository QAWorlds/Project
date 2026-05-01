package appium;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class open_calculator {

    static AndroidDriver driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void openCalculator() throws Exception {
        // Setting mobile capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 7");
        caps.setCapability("udid", "PBI7E6GQKFS4S4BM");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage", "com.android.calculator2");  // Corrected package for Calculator
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");  // Corrected activity
        caps.setCapability("automationName", "UiAutomator2");

        // Uncomment these if needed
        // caps.setCapability("noReset", true);
        // caps.setCapability("newCommandTimeout", 300);

        // Setting URL
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        // Initialize the Android Driver with a wait time
        driver = new AndroidDriver(url, caps);

        // Using WebDriverWait with Selenium 4 (Duration)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.calculator2:id/digit_1"))); // Example: wait for a digit button

        // Wait for a few seconds to allow the app to load
        Thread.sleep(5000); // Optional: Wait for the app to launch or sync elements
    }
}
