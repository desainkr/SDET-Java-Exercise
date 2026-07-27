package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapFirstandLastNumber {

	public static void main(String[] args) {

		int []arr = {1,2,3,4,5,6,7};
		
		//List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		int size=arr.length;
		
		int temp= arr[0];
		 arr[0]=arr[size-1];
		 arr[size-1]=temp;
		 
		 System.out.println(Arrays.toString(arr)); //[7, 2, 3, 4, 5, 6, 1]

	}

}
