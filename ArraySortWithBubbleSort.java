package SDETInterview;

import java.util.Arrays;

public class ArraySortWithBubbleSort {
	

	public static void main(String[] args) {
		
		int [] arr= {1,10,3,5,500,7};
		
		for (int i=0; i<arr.length-1 ;i++) { // number of passes
			for (int j=0; j<arr.length-1 ;j++) { //Iterations in each pass
				//The largest unsorted element moves to its correct position at the end.	
				 if (arr[ j ] > arr[ j+1]) {
					 //swap
					 int temp= arr[j];
					 arr[j]= arr[j+1];
					 arr[j+1]=temp;
					 // The Largest unsorted element moves to its correct position at the end 
				 }
				}
							
		}
		System.out.println(Arrays.toString(arr));
	}

}
