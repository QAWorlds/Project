package Top;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ch.qos.logback.core.joran.action.Action;

public class My_Practies {
    public static void main(String[] args) throws InterruptedException {
        
        // Launch Edge browser
        WebDriver driver = new ChromeDriver();
        
        // Open a webpage
       
        
        driver.get("https://testautomationpractice.blogspot.com/");
       
       driver.manage().window().maximize();
       
       List<WebElement> optionss = driver.findElements(By.xpath("//Select[@id='Skills']/option"));
    
 
    }
}
