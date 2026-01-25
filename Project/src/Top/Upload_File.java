package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Upload_File {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        // Locate the file input element (not the submit button)
        WebElement upload = driver.findElement(By.id("imagesrc"));

        // Provide the absolute path to the file you want to upload
        upload.sendKeys("C:\\path\\to\\your\\file.jpg");

        // Just for visibility before closing
        Thread.sleep(3000);
        driver.quit();
    }
}
