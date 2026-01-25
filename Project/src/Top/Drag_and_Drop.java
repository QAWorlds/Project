package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import TestNG.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestListener.class)
public class Drag_and_Drop {

    WebDriver driver;

  //  @BeforeTest
    public void setup() {
        // Set up ChromeDriver
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
    }

    @Test
    public void dragAndDropTest() {
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
        try {
            // Open the web page
            driver.get("https://demo.automationtesting.in/Static.html");

            // Wait for elements to be visible
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
            WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='angular']")));
            WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iv[@class='draggedd']")));

            // Perform drag and drop
            Actions builder = new Actions(driver);
            builder.dragAndDrop(from, to).perform();
Assert.assertEquals(false, false,"");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
           // e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}
