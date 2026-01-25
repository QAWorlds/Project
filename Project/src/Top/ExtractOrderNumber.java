package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.*;

public class ExtractOrderNumber {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/order");  // replace with actual URL

       // WebElement messageElement = driver.findElement(By.id("orderMessage"));
        //String messageText = messageElement.getText();
        
        String messageText = "thankyou #123456 wertyui";

        // Regex to find order number
        Pattern pattern = Pattern.compile("#\\d+");
        Matcher matcher = pattern.matcher(messageText);

        if (matcher.find()) {
            String orderNumber = matcher.group();
            System.out.println("Order Number: " + orderNumber);  // Output: #123456
        } else {
            System.out.println("Order number not found");
        }

        driver.quit();
    }
}
