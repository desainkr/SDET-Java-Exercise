package SDETInterview;

import java.util.*;

public class PairsDivisibleByK {

    public static int countPairs(int[] arr, int k) {
        int[] freq = new int[k];

        // Step 1: Count remainders
        for (int num : arr) {
            int rem = num % k;
            freq[rem]++;
        }

        int count = 0;

        // Step 2: Handle remainder 0
        count += (freq[0] * (freq[0] - 1)) / 2;

        // Step 3: Handle pairs (i, k-i)
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                count += freq[i] * freq[k - i];
            }
        }

        // Step 4: Special case when k is even
        if (k % 2 == 0) {
            count += (freq[k / 2] * (freq[k / 2] - 1)) / 2;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 36, 74, 52, 31, 42};
        int k = 3;

        System.out.println(countPairs(arr, k)); // Output: 7
    }
}
