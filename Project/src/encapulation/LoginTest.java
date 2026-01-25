package encapulation;

import org.testng.annotations.Test;
import encapulation.DriverManager;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        // Using encapsulated driver
        String title = DriverManager.getDriver().getCurrentUrl();
        System.out.println("Page Title: " + title);
        //DriverManager.getDriver().findElement(null);
    }
    
}
