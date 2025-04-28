package Top;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class MouseHoverClick {

    public static void main(String[] args) {

        // Custom device metrics for iPhone 15
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 430);
        deviceMetrics.put("height", 932);
        deviceMetrics.put("pixelRatio", 3.0);

        // Custom mobile emulation
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent",
                "Mozilla/5.0 (iPhone; CPU iPhone OS 17_0 like Mac OS X) " +
                "AppleWebKit/605.1.15 (KHTML, like Gecko) " +
                "Version/17.0 Mobile/15E148 Safari/604.1");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.oxo.com");
        driver.manage().window().maximize();

        System.out.println("Title: " + driver.getTitle());

        // driver.quit(); // optional
    }
}
