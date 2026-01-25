package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
@Test
public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("chromedivber.chrome.driver", "");
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		
System.out.print(false);//
/////////////////////

//////////////////////////////////////////

driver.switchTo().alert().dismiss();










	}

}
