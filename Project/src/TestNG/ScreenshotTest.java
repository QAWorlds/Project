package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

@Listeners(TestListener.class)  // Attach the listener
public class ScreenshotTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp(ITestContext context) {
//ChromeOptions option = new ChromeOptions();
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html"); // Replace with actual test URL
        TestListener.setDriver(driver); // Set driver in listener
    }

    

    @Test
    public void testFail() {
        System.out.println("This test will fail.");
        driver.findElement(By.id("nonexistent-element")).click(); // Fails (NoSuchElementException)
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }
}
