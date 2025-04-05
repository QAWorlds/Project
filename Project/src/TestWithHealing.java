import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWithHealing {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Delegate WebDriver
        WebDriver delegate = new ChromeDriver();

        // Wrap it with SelfHealingDriver
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);

        // Open your test URL
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        Select objselect = new Select(driver.findElement(By.xpath("(//Select[@type='text'])[1]")));
        objselect.selectByVisibleText("APIs");
        Thread.sleep(2000);
  	driver.findElement(By.id("firstpassword")).sendKeys("aravind");

        // Close the browser
       // driver.quit();
    }
}
