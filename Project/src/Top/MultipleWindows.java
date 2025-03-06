package Top;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
           WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
      driver.manage().window().maximize();
Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
	}

}
