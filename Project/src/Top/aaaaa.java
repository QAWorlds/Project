package Top;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aaaaa {
	
	
	@Test
    public  void test() throws InterruptedException, IOException {
       
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
       driver.get("https://testautomationpractice.blogspot.com/");
       
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(109));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))).click();

Wait<WebDriver> waits = new FluentWait<>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5)).
ignoring(NoSuchElementException.class);
       
}
}	


