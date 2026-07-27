package SDETInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		String str= "Java123";
		
		//Approach 1
		 String result=  str.replaceAll("\\d", "");
		 System.out.println("String without digits using repalceAll methods:" + result);
		
		//Approach 2
		 String str1 = "java123 string java";
		 List <Character> charSet= new ArrayList<>();
		StringBuilder sb= new StringBuilder();// Use StringBuilder for efficient modification
		 for(char ch: str1.toCharArray()) {
		  if(!Character.isDigit(ch)) {
				 //  sb.append(ch);
			 charSet.add(ch);
		  }			 
		 }
          // System.out.println("String without digits using Stringbuilder and if methods:" + sb);
            System.out.println("String without digits using map and if methods:" + charSet);
	}
}
