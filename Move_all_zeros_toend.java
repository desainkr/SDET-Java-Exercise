package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move_all_zeros_toend {

	public static void main(String[] args) {
		int[] arr = {0, 3, 4, 5, 0, 6,9,10};
		List<Integer> list = new ArrayList<>();

		int zeroCount = 0;
/*
 Key idea
First loop: count zeros, collect non-zeros
Second loop: append that many zeros at the end
 */
		for (int num : arr) {
		    if (num == 0) zeroCount++;
		    else list.add(num);
		}
		while (zeroCount > 0) {
		    list.add(0);
		    zeroCount--;
		}

		System.out.println(list);


	}

}
