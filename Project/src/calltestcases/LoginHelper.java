// File: LoginHelper.java
package calltestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHelper {

    public static void login(String username, String password) {
    	
    	WebDriver driver = new ChromeDriver();
        driver.get("https://your-application-url.com/login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();
    }
}
