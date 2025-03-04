package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class list_of_elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		
		
		
		 Select dropdown = new Select(driver.findElement(By.xpath("//option[text()='Select Skills']")));

		    //Get all options
		    List<WebElement> dd = dropdown.getOptions();

		    //Get the length
		    System.out.println(dd.size());

		    // Loop to print one by one
		    for (int j = 0; j < dd.size(); j++) {
		        System.out.println(dd.get(j).getText());

		    }
	}

}
