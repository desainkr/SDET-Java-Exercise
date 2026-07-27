package SDETInterview;

public class ArrayMaxandMin {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,10,25,500,700};
		
		int max= arr[0];
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			
			 if (arr[i]> max) {
		       max= arr[i];
			 }					
	      if (arr[i] < min) {
				  min= arr[i];
			 }
						
		}
		System.out.println("Max number is : " +max);
		System.out.println("Min  number is : " +min);
	}

}
