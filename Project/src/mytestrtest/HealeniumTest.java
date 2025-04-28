package mytestrtest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;

public class HealeniumTest {

    public WebDriver driver;  // Use WebDriver type instead of RemoteWebDriver
@BeforeMethod
    public void setup() {
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);  // No casting needed
        driver.manage().window().maximize();
    }
@Test
    public void runAutoHealingTest() {
        driver.navigate().to(getClass().getClassLoader().getResource("checkout/index.html"));
        driver.findElement(By.id("firstName")).sendKeys("Kasun");
        driver.findElement(By.id("lastName")).sendKeys("Herath");
        driver.findElement(By.id("username")).sendKeys("KHerath");
        // Continue with your test
    }
}
