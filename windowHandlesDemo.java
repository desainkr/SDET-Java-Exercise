package SDETInterview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowHandlesDemo {
	
	//button [normolize-space()="New Tab"];
	@Test
	void windowHandlesTest() {
		
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 String mainWin= driver.getWindowHandle();
		 //System.out.println(mainWin);
		//driver.findElement(By.xpath("//button[normalize-space()='New Tab']")).click();
		 driver.findElement(By.xpath("//button[@id='PopUp']")).click();
		Set <String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows.size());
		
		 driver.switchTo().window(mainWin);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
//		  for (String win:allWindows)
//		  {
//			  if(!win.equals(mainWin))
//			  {
//				  driver.switchTo().window(win);
//					 System.out.println(driver.getTitle());
//					 System.out.println(driver.getCurrentUrl());
//					 driver.close();
//			  }
//		  }
		
		 
		 
		 List<String> tabs= new ArrayList<>(allWindows);
		 driver.switchTo().window(tabs.get(0));
		 System.out.println(driver.getTitle());
    	 System.out.println(driver.getCurrentUrl());
    	 driver.switchTo().window(tabs.get(1));
    	 System.out.println(driver.getTitle());
    	 System.out.println(driver.getCurrentUrl());
    	 driver.switchTo().window(tabs.get(2));
    	 System.out.println(driver.getTitle());
    	 System.out.println(driver.getCurrentUrl());
    	 driver.quit();
	}

}
