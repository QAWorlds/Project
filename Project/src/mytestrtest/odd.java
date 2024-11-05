package mytestrtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class odd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-}generated method stub

		
		
		 
		        // Define the range
		  /*      int start = 1;
		        int end = 100;

		        System.out.println("Odd numbers between " + start + " and " + end + ":");
		        
		        // Loop through the range and find odd numbers
		        for (int i = start; i < end; i++) {
		            if (i % 2 != 0) { // Check if the number is odd
		                System.out.println(i);  */
		

	      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	              ChromeOptions options = new ChromeOptions();


	                   options.addArguments("--remote-allow-origins=*");
	                   WebDriver driver = new ChromeDriver(options);
	      
	               driver.get("https://demo.automationtesting.in/Register.html");
	              driver.manage().window().maximize();
	      Thread.sleep(5000);
		
	      
	      
	      
	      
		WebElement dropdown = driver.findElement(By.xpath("(//Select[@type='text'])[1]")); // Replace with actual dropdown ID

        // Initialize Select class for the dropdown
        Select selectf = new Select(dropdown);

        // Get all options from the dropdown
        List<WebElement> allOptions = selectf.getOptions();

        // Loop through options to find odd values
        for (WebElement option : allOptions) {
            String value = option.getAttribute("value"); 
            
            
            
            // Assuming the value attribute contains numbers
            try {
                int intValue = Integer.parseInt(value);  // Convert the value to an integer
                if (intValue % 2 != 0) {
                    System.out.println("Odd value: " + value);  // Print odd values
                }
            } catch (NumberFormatException e) 
            
            
            
            {
                // Handle the case where the value is not a number
                System.out.println("Non-numeric value: " + value);
		
		
            }}}
		            }