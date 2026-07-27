package SDETInterview;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrycatchBlock {

	public static void main(String[] args) throws TimeoutException {
		WebDriver driver = new ChromeDriver();
		
		try { 
			    WebElement element = driver.findElement(By.id("nonexistent")); 
		} catch (NoSuchElementException e) { 
		    System.out.println("Element not found: " + e.getMessage()); 
		} 
		 
		// Try-Catch-Finally 
		try { 
		    int[] arr = {1, 2, 3}; 
		    System.out.println(arr[5]); 
		} catch (ArrayIndexOutOfBoundsException e) { 
		    System.out.println("Index out of bounds"); 
		} finally { 
		    System.out.println("This always executes"); 
		} 
		 
		// Multiple Catch Blocks 
		try { 
		    // code 
		} catch (NoSuchElementException e) { 
		    System.out.println("Element not found"); 
		} catch (Exception e) { 
		    System.out.println("Generic exception"); 
		} 
		 
		// Try-Catch-Resources (Auto-closes resources) 
		try (FileInputStream file = new FileInputStream("test.txt")) { 
		    // Use file 
		} catch (IOException e) { 
		    e.printStackTrace(); 
		} 
		 
//		// Throw 
//		public void validateInput(String input) throws IllegalArgumentException { 
//		    if (input == null || input.isEmpty()) { 
//		        throw new IllegalArgumentException("Input cannot be empty"); 
//		    } 
//		} 
		

		

	}

}
