package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		
	// Using a List
		
		int[]arr = {1, 2, 3, 4, 5};
		List<Integer> revList = new ArrayList<>();
		for (int i=arr.length-1; i>=0;i--)
		{
			revList.add(arr[i]);
		}
		System.out.println(revList);
		
		// Using reversed Array
		
		int[] arr1 = {1, 2, 3, 4, 5,6};
		
		int [] reversedArr = new int[arr.length];
		int j=0;
		for (int i=arr.length-1; i>=0;i--)
		{
			reversedArr[j] = arr[i];
			j++;
		}
		
	System.out.println(Arrays.toString(reversedArr));
	
	// two Pointer  Approach
	
	int[] arr2 = {1, 2, 3, 4, 5};

	int left = 0;
	int right = arr2.length - 1;

	while (left < right) {
	    // 1. Swap the elements at left and right
	    int temp = arr2[left];
	    arr2[left] = arr2[right];
	    arr2[right] = temp;
	    
	    // 2. Move pointers closer to the center
	    left++;
	    right--;
	
	
	    
	}
	System.out.println(Arrays.toString(arr2));
	
	//ArraySortWithBubbleSort
	
	int [] arr3= {1,10,3,5,500,7};
	
	for (int k=0; k<arr3.length-1 ;k++) { // number of passes
		for (int l=0; l<arr3.length-1 ;l++) { //Iterations in each pass
			//The largest unsorted element moves to its correct position at the end.	
			 if (arr3[ l] > arr3[ l+1]) {
				 //swap
				 int temp= arr3[l];
				 arr3[l]= arr3[l+1];
				 arr3[l+1]=temp;
				 // The Largest unsorted element moves to its correct position at the end 
			 }
			}
						
	}
	System.out.println(Arrays.toString(arr3));
	}

}
