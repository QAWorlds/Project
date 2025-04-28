package Top;
import java.awt.AWTException;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Testcase {
    
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		
		
		//System.setProperty("chromedivber.chrome.driver", "");
		
		
		EdgeOptions option = new EdgeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new EdgeDriver();
		
	driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for (WebElement lists: list) {
			
			
			
			String url =lists.getAttribute("href");
			System.out.println(url);
		}
		
		
		
		
	}
	

}
	