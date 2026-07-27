package SDETInterview;

import java.util.Scanner;

public class Printonlytheinitials {
//Java program to input name, middle name and surname of a 	person and print only the initials.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Approach 1
		/*
		 * System.out.println("Enter firstNamer"); String fname = sc.next();
		 * System.out.println("Enter Middle"); String fmiddle = sc.next();
		 * System.out.println("Enter Lastname"); String lname =sc.next();
		 * 
		 * char f= fname.charAt(0); char m= fmiddle.charAt(0); char l= lname.charAt(0);
		 * System.out.println( f +"." + m+ "." +l);
		 */

		// Approach 2
		System.out.println("Enter Full name");
		String fullname = sc.nextLine();

		String[] words = fullname.split(" ");

		for (String word : words) {

			System.out.println(word.charAt(0)+ ".");
		}
		
	}
}
