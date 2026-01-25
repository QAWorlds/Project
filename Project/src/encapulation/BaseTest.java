package encapulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import encapulation.DriverManager;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        WebDriver driver = new ChromeDriver();
        DriverManager.setDriver(driver); // Setting driver using Encapsulation
        DriverManager.getDriver().get("https://www.google.com");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.getDriver().quit(); // Accessing driver using Encapsulation
    }
}
