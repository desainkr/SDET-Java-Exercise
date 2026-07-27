package SDETInterview;

import java.util.Scanner;

public class PrintEachwordalongwithhowmanycharactersitcontains {
	
	public static void main(String[] args) {
		
		//Print Each word along with how many characters it contains
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence:");
	String sentence = sc.nextLine();
	
	String words[]= sentence.split("\\s+");
	for ( String   word :words)
	{
		System.out.println(word+ " - "+word.length() + " characters");
		
		
	}
}
}
