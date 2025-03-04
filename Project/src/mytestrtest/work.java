package mytestrtest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class work {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
              ChromeOptions options = new ChromeOptions();


                   options.addArguments("--remote-allow-origins=*");
                   WebDriver driver = new ChromeDriver(options);
      
               driver.get("https://demo.automationtesting.in/Alerts.html");
              driver.manage().window().maximize();
      Thread.sleep(5000);
      
         
      
      
      
    ////////////// drag and drop /////
    /*     
     WebElement from = driver.findElement(By.xpath("(//img[@draggable='true'])[1]"));
     
     WebElement to = driver.findElement(By.xpath("//div[@id='droparea']"));
     
     Actions builder = new Actions (driver);
     
     builder.dragAndDrop(from, to).perform();*/
      
      
      
      
      
     Thread.sleep(2000);
    /* 
     
    driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
    Thread.sleep(5000);
    WebElement alart =  driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    Thread.sleep(5000);
    
    String me = driver.switchTo().alert().getText();
    driver.switchTo().alert().accept(); 
    
    System.out.print(alart.getText());*/
    
    //////////// ALARTS //////////////////
    
 /*   
    driver.switchTo().alert().dismiss(); //to cancel
    
    driver.switchTo().alert().accept(); // to ok
    
    driver.switchTo().alert().getText(); //This method is used to capture the alert message.
    
    driver.switchTo().alert().sendKeys("Text"); //This method is used to send data to the alert box.
    
    
    */
    
 /* String we = new  driver.getCurrentUrl();
    driver.getTitle();
    driver.getPageSource();
    */
     
     
     
   /*  
     
     
     
     
     
   // webpage links with tag "a"
     
     
     List<WebElement> links = driver.findElements(By.tagName("a"));

    // Loop through and extract the href attribute of each link
    for (WebElement link : links) {
        String url = link.getAttribute("href");
        System.out.println(url);
    }
    */
     
     
     
     
     Thread.sleep(5000);
    

	}

}



