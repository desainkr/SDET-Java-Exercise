package SDETInterview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// take full page screen shot 
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\googlehome.png");
		FileUtils.copyFile(src, trg);
		// take logo screen shot 
		WebElement logo= driver.findElement(By.id("hplogo"));
		File src1 = logo.getScreenshotAs(OutputType.FILE);
		File trg1= new File(".\\screenshots\\goggleLogo.png");
		FileUtils.copyFile(src1, trg1);
		
		


	}

}
