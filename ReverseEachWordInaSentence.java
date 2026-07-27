package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import freemarker.core.InvalidFormatStringException;

public class ReverseEachWordInaSentence {

	
	public static void main(String[] args) {
		
		String str= "Hello World";
		
		String[] words= str.split("\\s+");
		
		for(String word:words) {
			String rev="";
			for(int i =word.length()-1; i>=0;i--) {
			rev=rev+ word.charAt(i);
		}
			System.out.print(rev);
			System.out.print(" ");
			
		}
	
		int []arr= { 1, 3, 4, 5, 8, 9, 7, 100, 99 };
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1, 3, 4, 5, 8, 9, 7, 100, 99));
		 
		Collections.sort(list);
		System.out.println(list);
		int max = Collections.max(list);
		System.out.println("the max number :" + max);
		int min = Collections.min(list);
		System.out.println("the min number :" + min);
		
		
			
		
	}
}
