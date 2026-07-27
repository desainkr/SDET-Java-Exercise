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

public class SelectDynamicDropDown {
   static  WebDriver driver;
	public static void main(String[] args) {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.findElement(By.xpath("//button[@id='menu1']")).click();
	   List<WebElement>  dpOptions=  driver.findElements(By.xpath("//li[ contains(@role,\"presentation\")]"));
	   System.out.println(dpOptions.size());
	   for(WebElement option:dpOptions)
	   {
		   System.out.println(option.getText());
	   }	   
	   
	   //Select multiple options
	   
	   for(WebElement option:dpOptions)
	   {
		   String op= option.getText();
		 if(op.equals("HTML") || op.equals("CSS")){
			 option.click();
		 }
	   }
	   
	    driver.quit();
}
			 		 

	}


