package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("chromedivber.chrome.driver", "");
		
		
		EdgeOptions option = new EdgeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new EdgeDriver();
		
	driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		
System.out.print(false);//
/////////////////////

//////////////////////////////////////////

driver.switchTo().alert().dismiss();










	}

}
