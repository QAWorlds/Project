package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {
        return new Object[][] {
            { "user1@example.com", "1234567890" },
            
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String phone) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement phoneField = driver.findElement(By.xpath("//input[@type='tel']"));

        emailField.sendKeys(username);
        phoneField.sendKeys(phone);

        System.out.println("Test executed with Email: " + username + ", Phone: " + phone);

       // driver.quit();
    }
}
