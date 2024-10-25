package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("chromedivber.chrome.driver", "");
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("http://www.google.com");
		
		
		driver.manage().window().maximize();
		
		
		Select object = new Select(driver.findElement(null));
		object.selectByVisibleText("visa");  

	}

}
