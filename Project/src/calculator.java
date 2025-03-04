

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class calculator {

    static AndroidDriver driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
    }//

    public static void openCalculator() throws Exception {
        try {
            // Setting mobile capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S9");
            caps.setCapability(MobileCapabilityType.UDID, "5136305334573398");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
            caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
            caps.setCapability("appActivity", "com.sec.android.app.popcalculator.CalculatorActivity");

            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability("appWaitDuration", 30000); // 30 seconds
            caps.setCapability("noReset", true);
            caps.setCapability("newCommandTimeout", 60000);
            caps.setCapability("adbExecTimeout", 60000);

            // Setting URL for Appium Server
            URL url = URI.create("http://192.168.0.176:4723/").toURL();
            Thread.sleep(5000);
            // Initialize the Android Driver
            driver = new AndroidDriver(url, caps);

            // Wait for the app to launch and an element to be present
           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
          //  WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.sec.android.app.popupcalculator:id/some_element"))); // Replace with an actual element ID
            System.out.println("Calculator App Launched Successfully!");

            // Close the session
            driver.quit();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
