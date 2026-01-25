// calltestcases/Login.java
package calltestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void Login_Functionality() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://your-application-url.com/login");

        // Create object of LoginHelper
        LoginHelper oxo = new LoginHelper();

        // Call the login method
        oxo.login("testuser", "password123");

        // Close the browser after test
        driver.quit();
    }
}
