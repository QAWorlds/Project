package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import yourpackage.ExcelUtils;  // Replace 'yourpackage' with the actual package name
import org.openqa.selenium.chrome.ChromeOptions;


public class ReadExcel {
    public static void main(String[] args) throws Exception {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

    	 ChromeOptions option = new ChromeOptions();
    	 		
    	 		option.addArguments("--remote-allow-origins*");
    	 		
    	 		WebDriver driver = new ChromeDriver();
    	 		
    	 	driver.get("https://demo.automationtesting.in/Register.html");
    	 	 driver.manage().window().maximize();
    	 	Thread.sleep(5000);
    	 	
    	 	
    	 	

        // Read test data from Excel
        String file = "C:\\Users\\Aravind\\git\\aravind\\Project\\Project\\LoginData.xlsx";

        String username = ExcelUtils.getCellData(file, "Sheet1", 1, 0);
        String password = ExcelUtils.getCellData(file, "Sheet1", 1, 1);

        // Perform login using data from Excel
        WebElement userField = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passField = driver.findElement(By.xpath("//input[@type='tel']"));
       // WebElement loginButton = driver.findElement(By.id("login"));

        userField.sendKeys(username);
        passField.sendKeys(password);
        //loginButton.click();

        System.out.println("Test executed with Username: " + username);
       // driver.quit();
    }
}
