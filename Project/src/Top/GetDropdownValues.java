package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class GetDropdownValues {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        // Locate the dropdown
     ///  / WebElement dropdown =  driver.findElement(By.id("Skills"));

        // Create Select instance
        Select select = new Select( driver.findElement(By.id("Skills")));

        // Get all options
        List<WebElement> options = select.getOptions();

        // Loop through and print the visible text of each option
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
}
