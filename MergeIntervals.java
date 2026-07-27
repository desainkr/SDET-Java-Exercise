package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	/*
	 * “First, I sort the intervals by their start time. Then I take the first
	 * interval as my current [start, end]. I iterate through the rest of the
	 * intervals: if the next interval’s start is less than or equal to my current
	 * end, they overlap, so I merge by extending end to the max of both. If they
	 * don’t overlap, I add the current [start, end] to the result list and reset
	 * start and end to the new interval. After the loop, I add the last interval
	 * and return the merged list as a 2D array.”
	 */

	public static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int start = intervals[0][0];
		int end = intervals[0][1];

		List<int[]> merged = new ArrayList<>();

		for (int i = 1; i < intervals.length; i++) {
			int s = intervals[i][0];
			int e = intervals[i][1];

			if (s <= end) {
				// over lapping
				end = Math.max(end, e);

			} else {
				merged.add(new int[] { start, end });
				start = s;
				end = e;
			}

		}

		merged.add(new int[] { start, end });
		return merged.toArray(new int[merged.size()][]);
	}

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		int[][] result = merge(intervals);

		for (int[] interval : result) {
			System.out.println(Arrays.toString(interval));
		}

	}

}
