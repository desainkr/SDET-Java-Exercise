package SDETInterview;

import java.util.Scanner;

public class GeneratePrimenumbersbetween1Andgiven4 {
	
    // Natural number >1
    // A prime number is a whole number greater than 1 that can only be divided evenly by 1 and itself. I
	//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter start number");
//		int stratnum = sc.nextInt();
//		System.out.println("Enter end number");
//		int endnum = sc.nextInt();

	 int num =6;
	 int count =0;
	 
	       if (num > 1) 
	        {
				 for (int i=1; i<=num; i++) 
				     {	if (num % i == 0)   count++;
					  }
				
					  if (count ==2) 
					  {
						  System.out.println("It's A Prime number");
					  }
					  else
					  {
					  System.out.println("It's not A Prime number");
					  }
	       }
	      else
		 {
			 System.out.println("It's not A Prime number");
		 }

	

} }
