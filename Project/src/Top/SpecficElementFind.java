package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpecficElementFind {
    public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Register.html");
       driver.manage().window().maximize();
Thread.sleep(5000);
	


        WebElement targetElement = driver.findElement(By.cssSelector("button#Button1")); // Replace with actual XPath

        // Create JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", targetElement);

        // Close the browser
      //  driver.quit();
    }
}
