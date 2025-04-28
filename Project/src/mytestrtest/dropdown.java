package mytestrtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class dropdown {

    SelfHealingDriver selfHealingDriver; // Global so you can close later if needed

    @Test
    public void testDropdown() throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Wrap with Healenium SelfHealingDriver
        selfHealingDriver = SelfHealingDriver.create(driver);

        // Open URL
        selfHealingDriver.get("https://demo.automationtesting.in/Register.html");
        selfHealingDriver.manage().window().maximize();

        // Wait for the page to load and be ready
        Thread.sleep(5000);

        // Find the input field and perform action
        selfHealingDriver.findElement(By.xpath("//input[@type='il']")).sendKeys("ueujdfiwjfiwjdi");

        // Find the dropdown and select an option
        WebElement text = selfHealingDriver.findElement(By.xpath("//Select[@class='form-control ng-pristine ng-untouched ng-valid']"));
        Select object = new Select(text);
        object.selectByVisibleText("Troubleshooting");

        // Print options from the dropdown
        List<WebElement> optionss = object.getOptions();
        for (int i = 0; i < optionss.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(optionss.get(i).getText());
            }
        }
    }

    @AfterTest
    public void close() {
        // Close the driver
        if (selfHealingDriver != null) {
            selfHealingDriver.quit();
        }
    }
}
