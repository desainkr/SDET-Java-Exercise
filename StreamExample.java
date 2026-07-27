package SDETInterview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamExample {

	public static void main(String[] args) throws IOException {
	/*	// Question : How do you create Streams
		List<String> names1 = Arrays.asList("alice", "bob");
		// 1.List ->stream
		Stream<String> stream1 = names1.stream();
		String[] names = { "John", "Mary", "John", "David", "Mary", "Scott" };
		// 1.Array ->stream
		Stream<String> stream = Arrays.stream(names);
		// 3.Stream of
		Stream<String> stream2 = Stream.of("Java", "Stream", "Syntax");
		stream2.forEach(System.out::println);
		// 4.Stream Generate
		Stream<Double> limit = Stream.generate(Math::random).limit(5);
		
		 // Primitive Array
		int [] premitiveArray = {1,2,3,4};
		IntStream  intStream =    Arrays.stream(premitiveArray);
		intStream.forEach(System.out::println);
		
		// Object Arrays
		Integer [] objectArray = {1,2,3,4};
		Stream<Integer> integerStream=Stream.of(objectArray);
		integerStream.forEach(System.out::println);
		 
		// List
		  List<Integer> IntegerList= Arrays.asList(1,2,3,4);
		  IntegerList.stream().forEach(System.out::println);  
		
		// Find Even numbers
		
		  List<Integer> numbers= Arrays.asList(1,2,3,4,6,8,9);
		  numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		  
		  // Convert into uppercases
		  
		  List<String> names1 = Arrays.asList("alice", "bob","David", "Mary", "Scott" );
		   names1.stream().map(str->str.toUpperCase()).forEach(System.out::println); 
		
		//reduce
		
		  List<Integer> numbers= Arrays.asList(1,2,3,4,6,8,9);
		  Integer  sum= numbers.stream().reduce(0,(a,b)->a+b);
		  System.out.println(sum);  
		  
		  //Sorted  numbers and Strings
		  
		  List<Integer> numbersort= Arrays.asList(5,6,8, 9,1,2,3,4);
		  numbersort.stream().sorted().forEach(System.out::println);
		  numbersort.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		  
		  List<String> namessoreted = Arrays.asList("alice", "bob","David", "Mary", "Scott" ); 
		  
	namessoreted.stream().sorted(Comparator.comparingInt(String::length)).toList().forEach(System.out::println);
	namessoreted.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList().forEach(System.out::println);	
		// Min and max
		List<Integer> numbermin= Arrays.asList(5,6,8, 9,1,2,3,4);
		
		Optional<Integer> min= numbermin.stream().min(Comparator.naturalOrder());
		System.out.println(min);
		
		   
		Optional<Integer> max= numbermin.stream().max(Comparator.naturalOrder());
		System.out.println(max); 
		
		                              // find fistnumber
		
		List<Integer> numberfirstnum= Arrays.asList(5,6,8, 9,1,2,3,4);
		
		Optional<Integer> fnum= numberfirstnum.stream().findFirst();
		System.out.println(fnum);
		
		Optional<Integer> fnum1= numberfirstnum.stream()
				                                                                 .filter(n->n%2==0)
				                                                                 .findFirst();
		System.out.println(fnum1);
		
		//  Sum
		List<Integer> numbersum= Arrays.asList(5,6,8, 9,1,2,3,4);
		int sum =numbersum.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
		//Filter even numbers from List
		
		List<Integer> evennumbers= Arrays.asList(5,6,8, 9,1,2,3,4);
		evennumbers.stream().filter(even->even %2==0).forEach(System.out::println);
		 
		//Convert numbers in list to their squares
		
		List<Integer> squrnumbers= Arrays.asList(5,6,8, 9,1,2,3,4);
		squrnumbers.stream().map(s-> s*s).forEach(System.out::println);  
		  
		//Square Even Numbers  
		List<Integer> squrEvenNumbers= Arrays.asList(5,6,8, 9,1,2,3,4);
		List<Integer>  squrevennumbers=squrEvenNumbers.stream().filter(n -> n%2==0)
														.map(n->n*n)
													//	.forEach(System.out::println);
													//	.collect(Collectors.toList());
														.toList();
		System.out.println(squrevennumbers);  
		
		// Find the first number greater than 10 from List 
		      
		List<Integer> findFirstNumber= Arrays.asList(5,9,10,11,15,20);
		Optional<Integer> findfirstnumber = findFirstNumber.stream().filter(n ->(n>10)).findFirst();
		System.out.println(findfirstnumber);
		
		// Count how many numbers are greater than 5 in list 
		
		List<Integer> NumbersGreaterThanFive= Arrays.asList(5,6,8, 9,1,2,3,4);
		
		long  numcount = NumbersGreaterThanFive.stream().filter(n-> n>5).count();
		System.out.println(numcount);
		
		
		// Find the sum/product of all numbers in List
		
		List<Integer> NumbersSum= Arrays.asList(5,6,8, 9,1,2,3,4);
		
		Integer sum= NumbersSum.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		   //product
		
	List<Integer> NumbersProd= Arrays.asList(5,6,8, 9,1,2,3,4);
		
		Integer product= NumbersProd.stream().reduce(1,(a,b)->a*b);
		System.out.println(product);
		
		
		  //Find sum of even numbers in list
		List<Integer> numbersEvenSum= Arrays.asList(5,6,8, 9,1,2,3,4);
		
		Integer  sum= numbersEvenSum.stream().filter(n->n%2==0)
				 //.mapToInt(Integer::intValue).sum(); //working
				.reduce(0,(a,b)->a+b);
		System.out.println(sum);
		            
		// Find maximum number for the list   Method Reference (::)
		
		
		List<Integer> findFirstNumber= Arrays.asList(5,9,10,11,15,20);
		
		Integer maxnum= findFirstNumber.stream()
																									//	.max(Comparator.naturalOrder());
																										.reduce(0,(a,b)->Integer.max(a, b));
		
		System.out.println(maxnum);
		
		*/
		
		// EvenSquaredSum
		
		List<Integer> number= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		     
		Integer numevsqsu= number.stream().filter(n->n%2==0)
		                              .map(n->n*n)
		                              .reduce(0,(a,b)->a+b);
		System.out.println(numevsqsu);
		                              
	}
}