package testngtest;
import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class Test1 {
public String baseUrl = "https://www.browserstack.com/";
//String driverPath = "D:\\Selenium\\chromedriver.exe";
public WebDriver driver ;
@BeforeTest
public void launchBrowser() {
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--remote-allow-origins*");
	
	WebDriver driver = new ChromeDriver();
//driver = new ChromeDriver();
driver.get(baseUrl);
}
@Test
public void verifyHomepageTitle() {
String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
}
@AfterTest
public void terminateBrowser(){
driver.close();
}
}