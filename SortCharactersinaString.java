package SDETInterview;

import java.util.Arrays;

public class SortCharactersinaString {

	public static void main(String[] args) {
		String   str= "rock"; //ckor
		
		// 1. Convert to char array
        char[] chars = str.toCharArray();
          Arrays.sort(chars);
         System.out.println(chars); //ckor
         
         
         // 3. Convert back to string
         String sortedStr = new String(chars);
         
         
         // Output: ckor
         System.out.println(sortedStr); 
         
	}
}
