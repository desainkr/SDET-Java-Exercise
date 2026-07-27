package SDETInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Pricevalidation {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("app_logo")).isDisplayed();
		
		WebElement ele= driver.findElement(By.cssSelector("[data-test=\"product-sort-container\"]"));
		Select sel = new Select(ele);
		sel.selectByValue("lohi");
		
		List<WebElement>  priceElements= driver.findElements(By.cssSelector("[data-test=\"inventory-item-price\"]"));
		
		List<Double> actualPrices = new ArrayList<>();
		 for (WebElement price: priceElements) {
			 
			  actualPrices.add(Double.parseDouble(price.getText().replace("$", "")));
			 
		 }
		 System.out.println(actualPrices);
		 //Create a copy and sort ascending
		 
		 List<Double> expectedPrices= new ArrayList<>(actualPrices);
		 Collections.sort(expectedPrices);
		 System.out.println(expectedPrices);
		// Validation
		 Assert.assertEquals(actualPrices, expectedPrices, "Prices are not sorted in ascending order");
		 
		
		driver.close();

	}

}
