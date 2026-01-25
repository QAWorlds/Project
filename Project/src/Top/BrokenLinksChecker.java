  package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class BrokenLinksChecker {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Static.html");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Broken or empty link: " + link.getText());
            } 
        }

        driver.quit();
    }
}
