package Locatorss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
		
		Thread.sleep(5000);		
		Thread.sleep(5000);	   
		Thread.sleep(5000);	
		                   
///////// normal xpath /////////////////////////////
		
/*
		Advanced Techniques in Relative XPath:
			Using Attributes: Select elements based on specific attributes.
			Example: //input[@id='username']
			Using Text() Function: Select elements based on the text content.
			Example: //button[text()='Submit']
			Using Contains() Function: Match partial values of attributes or text.
			Example: //input[contains(@class, 'search')]
			Using Starts-with() Function: Match attributes that begin with specific characters.
			Example: //div[starts-with(@id, 'user-')]
			Using Positioning (Indexing): Select elements by their position.
			Example: (//div[@class='list-item'])[3]
		
		
===================================================================================================================================================================

		
		
		Absolute XPath
Full, exact path from the root to the element.
Example: `/html/body/div[2]/table/tr[3]/td[4]`

2. Relative XPath
Locates elements using attributes without needing the full path.
Example: `//input[@type='text' and @name='username']`

3. Wildcard XPath
Uses `*` to match any element, helpful for dynamic attributes.
Example: `//*[contains(@class, 'button')]`

4. Indexed XPath
Targets a specific element by index within matching elements.
Example: `(//div[@class='item'])[3]`

5. Sibling XPath
Selects elements at the same level as the target.
Example: `//h1/following-sibling::p[1]`

6. Parent XPath
Selects the parent of a target element.
Example: `//div[@id='container']/parent::body`

7. Ancestor XPath
Finds any ancestor of the target element.
Example: `//div[@id='content']//h2/ancestor::div`

Additional Techniques:

8. Text-Based XPath
Locates elements by visible text.
Example: `//button[text()='Submit']`

9. `contains()` XPath
Finds elements with partial matching text or attributes.
Example: `//div[contains(@id, 'error')]`

10. `starts-with()` XPath
Locates elements whose attribute values begin with a specific string.
Example: `//input[starts-with(@name, 'user')]`

11. Chained XPath
Combines multiple conditions to precisely locate elements.
Example: `//div[@class='container']//span[@class='label'][text()='Username']`

12. Following XPath
Selects elements that come after the target element.
Example: `//div[@class='header']/following::input[1]`

13. Preceding XPath
Selects elements that come before the target element.
Example: `//h2[@id='title']/preceding::div[2]`

14. OR and AND in XPath
Combines multiple conditions for more flexible searches.
Example: `//input[@type='text' or @type='email']`
		
		*/
		
		
	}

}
