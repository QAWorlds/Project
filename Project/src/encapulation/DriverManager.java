package encapulation;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    // private WebDriver instance (Encapsulated)
    private static WebDriver driver;

    // Public setter to assign value
    public static void setDriver(WebDriver d) {
        driver = d;
    }

    // Public getter to get the driver
    public static WebDriver getDriver() {
        return driver;
    }
}
