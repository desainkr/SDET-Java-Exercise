package SDETInterview;

import java.util.Scanner;

public class ReverseFirstLastDigit {

	public static void main(String[] args) {
		
		  int num = 12345;
	        String str = Integer.toString(num);
	        
	        if (str.length() > 1) {
	            char first = str.charAt(0);
	            char last = str.charAt(str.length() - 1);
	            String middle = str.substring(1, str.length() - 1);
	            
	            // Swap first and last digits
	            String swapped = last + middle + first;
	            int result = Integer.parseInt(swapped);
	            
	            System.out.println("Original: " + num);
	            System.out.println("Swapped: " + result); // Outputs 52341
	        }
	
//		int num = 12345;
//        int original = num;
//
//        int lastDigit = num % 10;
//        // Find first digit and count digits
//        int temp = num;   //temp = 12345
//        int digits = 0;
//        int firstDigit = 0;
//        
//        while(temp >0)
//        {
//        	firstDigit = temp%10; // firstDigit = 12345 % 10 = 5
//        	
//        	temp= temp/10;     //temp = 12345 / 10 = 1234
//        	digits++;                 //digits = 1
//        	
//        	/* final value
//        	 firstDigit = 1
//             digits = 5
//
//        	 */
        }
     // Build power of 10 manually (instead of Math.pow)
//        int pow = 1;
//        for (int i = 1; i < digits; i++) {
//            pow *= 10;
//        }
//
//        // Remove first digit
//        num = original % pow;
//
//        // Remove last digit
//        num = num / 10;
//
//        // Rebuild number
////        int result = lastDigit * pow + num * 10 + firstDigit;
////
////        System.out.println("Original: " + original);
////        System.out.println("Modified: " + result);
	

}
