package Top;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Accertions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement mousehover = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));

        Thread.sleep(5000);

        action.moveToElement(mousehover).perform();
        
        driver.findElement(By.xpath("//a[text()='Alerts']")).click();

        WebElement pagetitle = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
        
        String actualText = pagetitle.getText();
        System.out.println(actualText);
        String expectedText = "Automation Demo Site";
    String  url =     driver.getTitle();
        Assert.assertEquals( url, "Alerts");
        
        Assert.assertEquals(actualText, "Automation Demo Site", "Page title mismatch!");
    }
}
