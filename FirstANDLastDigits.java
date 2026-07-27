package SDETInterview;

public class FirstANDLastDigits {

	public static void main(String[] args) {
		 int num= 123768;
		 
		 // last digit
		int  lastdigit= num%10;
		System.out.println("Last digit is : " +lastdigit);
		
		//firstdigit 
		int firstDigit=0;
		while (num != 0)
		{
			firstDigit= num;
			num = num/10;
		}
		System.out.println("First Digit is : " + firstDigit);	
		

	}

}
