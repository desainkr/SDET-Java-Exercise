package SDETInterview;

import java.util.HashMap;
import java.util.Map;

public class Printarrayelementsappearing2ORmoretimes {

	public static void main(String[] args) {
		// Print array elements appearing 2 OR more times
		int[] arr = { 1, 2, 3, 2, 3, 4, 5, 1 };
		Map<Integer, Integer> map = new HashMap<>();
		// Approach 1 Print array elements appearing 2 OR more times
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : arr) {
			if(map.get(num) > 1) {
				System.out.println("array elements appearing 2 OR more times" +num);
				break;
			}
		}
		// Approach 2
		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);

			} else {
				map.put(num, 1);
			}
		}
		System.out.println(map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				System.out.println(entry.getKey());
			}

		}
	}

}
