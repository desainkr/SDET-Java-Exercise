package SDETInterview;

import java.util.Arrays;


public class RearrangeArray {
	

	public static void main(String[] args) {
		//Rearrange Array (Even first, Odd last) using two pointer
		int [] arr= {2, 0, 5, 8, 3, 9, 4, 6};
		
		int left=0, right=arr.length-1;
		 while (left<right)
			         if (arr[left] % 2==0) {
			        	 left++;
			        		        	 	        	 
			         }else {
			        	 int temp=  arr[left];
			        	 arr[left]= arr[right];
			        	 arr[right]=temp;
			        	  right--;
			         }
			System.out.println(Arrays.toString(arr)); 
		 }
		
	
}
