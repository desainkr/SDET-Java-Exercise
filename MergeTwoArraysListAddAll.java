package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArraysListAddAll {

	public static void main(String[] args) {
		int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};
     // 1. Convert to List and use addAll
        List<Integer> list = new ArrayList<>();
        
        list.addAll(Arrays.asList(5, 3, 2)); // Add elements of arr1
        list.addAll(Arrays.asList(9, 0, 1)); // Add elements of arr2

        System.out.println(list);
        
	}

}
