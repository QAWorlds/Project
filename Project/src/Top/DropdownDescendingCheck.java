package Top;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class DropdownDescendingCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        Select dropdown = new Select(driver.findElement(By.id("Skills")));

        List<String> optionsList = new ArrayList<>();
        for (WebElement option : dropdown.getOptions()) {
            optionsList.add(option.getText());
        }

       

      
        List<String> descendingList = new ArrayList<>(optionsList);
        Collections.sort(descendingList, Collections.reverseOrder());

       
        System.out.println("Descending: " + descendingList);
        
        
    }}
