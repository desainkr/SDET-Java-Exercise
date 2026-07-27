package SDETInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondsmallestDigitinaString {

	public static void main(String[] args) {
		//Second smallest Digit in a String
		String str="claude2403edualc";
		List<Character> digits = new ArrayList<>();
		
		for(char ch: str.toCharArray()) {
			
			 if (Character.isDigit(ch)) {
				  digits.add(ch);
		  
			 }
			
		}
		
	Collections.sort(digits);
System.out.println(digits.get(1));
	}

	
}
