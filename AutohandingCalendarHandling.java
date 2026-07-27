package SDETInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutohandingCalendarHandling {

	static WebDriver driver;
	public static void main(String[] args) {
	    ChromeOptions  options= new ChromeOptions();
	    options.addArguments("--disable-notifications");
	  
		 driver = new ChromeDriver(options);
		 driver.get("https://www.yatra.com/");
		 driver.manage().window().maximize();
		 	 
		 // find current month year 
		driver.findElement(By.xpath("//span[normalize-space()='Departure Date']")).click();   // //div[@aria-label="Departure Date inputbox" and @role="button"]
		String currentMonthYear  = driver.findElement(By.className("react-datepicker__current-month")).getText();
		System.out.println(currentMonthYear);
		
      List<WebElement> months = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']"));
      System.out.println(months.size());
      
      // month 1
      WebElement currentMonth = months.get(0);
      
      //Month2
      WebElement nextMonth = months.get(1);
   
   // Month 1 prices
      List<WebElement> pricesMonth1 = currentMonth.findElements(
    		    By.xpath(".//*[contains(text(),'')]")
    		);
     
      int lowestMonth1 = Integer.MAX_VALUE;

      for (WebElement ele : pricesMonth1) {
          String priceText = ele.getText().replace("₹", "").replace(",", "").trim();
          if (!priceText.isEmpty()) {
              int price = Integer.parseInt(priceText);
              lowestMonth1 = Math.min(lowestMonth1, price);
          }
      }

      // Month 2 prices
      List<WebElement> pricesMonth2 = nextMonth.findElements(
    		    By.xpath(".//*[contains(text(),'₹')]")
    		);

      int lowestMonth2 = Integer.MAX_VALUE;

      for (WebElement ele : pricesMonth2) {
          String priceText = ele.getText().replace("₹", "").replace(",", "").trim();
          if (!priceText.isEmpty()) {
              int price = Integer.parseInt(priceText);
              lowestMonth2 = Math.min(lowestMonth2, price);
          }
      }

      int overallLowest = Math.min(lowestMonth1, lowestMonth2);

      System.out.println("Lowest Current Month: " + lowestMonth1);
      System.out.println("Lowest Next Month: " + lowestMonth2);
      System.out.println("Overall Lowest: " + overallLowest);


	}

}
