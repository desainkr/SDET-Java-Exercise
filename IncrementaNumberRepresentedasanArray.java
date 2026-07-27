package SDETInterview;
import java.util.Arrays;

public class IncrementaNumberRepresentedasanArray {
	
	public static void main(String[] args) {
		
		int[] digits = {1, 2, 9};
		for (int i=digits.length-1; i>=0;i--) {
		  if (digits[i]<9) {
				  digits[i]++;
				  System.out.println(Arrays.toString(digits));
				  break;
			  }
			  digits[i] = 0;
			  System.out.println(Arrays.toString(digits));
		}
		// if all were 9 or end digit 9
		
		int[] result= new int[digits.length +1];
		result[0]=1;
		System.out.println(Arrays.toString(result));
//		
	}

}
