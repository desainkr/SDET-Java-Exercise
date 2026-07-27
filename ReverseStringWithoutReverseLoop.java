package SDETInterview;
import java.io.*;
import java.util.Scanner;
public class ReverseStringWithoutReverseLoop {

		public static void main (String[] args) 
		{
		String str= "Geeks", nstr="";
		char ch;
		System.out.print("Original word: ");
		System.out.println("Geeks"); //Example word
		for (int i=0; i<str.length(); i++)
		{
		 ch= str.charAt(i); //extracts each character
		nstr=  ch + nstr; //adds each character in front of the existing string
	     }
		/*
		 nstr = ch + nstr reverses the string
	      nstr = nstr + ch keeps the string the same
	     This is one of those small but powerful Java concepts.
		 */
		System.out.println("Reversed word: "+ nstr);
		 // or 
		
		//String rev="";
//		
//				for (int i=str.length()-1; i>=0 ;i--)
//				{
//                     rev +=str.charAt(i);				
//				}
//				
//				System.out.println(rev);
		
	}
}
