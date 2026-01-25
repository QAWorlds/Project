package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

      

        // Check if checkbox is displayed and enabled
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));

        if (checkbox.isDisplayed() && checkbox.isEnabled() && !checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox was not selected, so clicked.");
        } else {
            System.out.println("Checkbox is either already selected or not interactable.");
        }


      //  driver.quit();
    }
}
