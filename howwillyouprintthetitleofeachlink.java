package SDETInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class howwillyouprintthetitleofeachlink {
   static  WebDriver driver;
	public static void main(String[] args) {
		//how will you print the title of each link
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			   if (!links.get(i).isDisplayed() || !links.get(i).isEnabled()) {
	            continue;
	        }
		    links.get(i).click();
		    System.out.println(driver.getTitle());
		    driver.navigate().back();
		    links = driver.findElements(By.tagName("a"));
		    
}

}
			 
		 

	}


