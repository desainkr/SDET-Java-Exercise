package SDETInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDown {
   static  WebDriver driver;
	public static void main(String[] args) {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
	     WebElement selectdp= driver.findElement(By.id("country"));
	     selectdp.click();
              
	     Select sel= new Select(selectdp);
	     sel.selectByIndex(1);
	     sel.selectByValue("india");
	     sel.selectByVisibleText("United States");
	  	     
	     List<WebElement> options=sel.getOptions();
	     System.out.println(options.size());
	     System.out.println("results with for loop");
	     for(int i=0;i<options.size();i++) {
	    	 
	    	 System.out.println(options.get(i).getText());
	     }
	     System.out.println("results with advanced loop");
	     for (WebElement opt: options) {
	    	 System.out.println(opt.getText());
	    	 
	     }
	     
	     
	    driver.quit();
}		 		 

	}


