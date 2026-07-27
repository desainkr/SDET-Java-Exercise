package SDETInterview;

import java.util.HashSet;
import java.util.Set;

public class CommonCharsBetweenTwoStrings {

	public static void main(String[] args) {
		String str1="thin";
		String str2="thick";
			
		Set<Character> set1= new HashSet<>();
		for(char ch: str1.toCharArray()) {
			
			set1.add(ch);
		}
Set<Character> result= new HashSet<>();
		
for(char c: str2.toCharArray()) {
			
			if (set1.contains(c)){
				result.add(c);
			}
		}
		System.out.println(result);
		
	}
	
}
