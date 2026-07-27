package SDETInterview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavscriptExecutetorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		// Java script executor Syntax
       //	JavascriptExecutor js = (JavascriptExecutor)driver;
      //	js.executeScript(Script, args);
            
		
//		    Flash
		/*
//		    Drawing border and take screenshot
		 WebElement logo = driver.findElement(By.xpath("//a[@class=\"list-group-item\" and @id=\"cat\"]"));
		  javaScriptUtil.drawBorder(logo,driver);
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src= ts.getScreenshotAs(OutputType.FILE);
		  File trg= new File(".//screenshots/logojs.png");
		  FileUtils.copyFile(src, trg);
		
//		    Getting title of the page
  		 String title = javaScriptUtil.getTitleByJS(driver);
  		 System.out.println(title);
		  
//		    click action
  		   WebElement buttonclk = driver.findElement(By.cssSelector("[data-target=\"#exampleModal\"]"));
  		    javaScriptUtil.clickElementByJS(buttonclk, driver);
  		    */
  		    
//		    generate alert
//		    refreshing the page
//		    scrolling the page
//		    scroll down page
		Thread.sleep(500);
  		  javaScriptUtil.scrollPageDown(driver);
  		
  		  Thread.sleep(500);
//		    scroll up page
  		 javaScriptUtil.scrollPageUp(driver);
//		    zoom page
//		    
		
		
		//driver.close();
		
	}

}
