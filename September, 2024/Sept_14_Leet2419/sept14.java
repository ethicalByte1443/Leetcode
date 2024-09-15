package Sept_14_Leet2419;

import java.util.List;

public class sept14 {
    public int longestSubarray(List<Integer> nums) {
        // Step 1: Find the maximum value in the list
        int max_val = Integer.MIN_VALUE;
        for (int num : nums) {
            max_val = Math.max(max_val, num);
        }

        // Step 2: Iterate through nums to find the longest subarray of max_val
        int longest = 0;
        int current_length = 0;

        for (int num : nums) {
            if (num == max_val) {
                current_length++;
                longest = Math.max(longest, current_length);
            } else {
                current_length = 0;
            }
        }

        return longest;
    }
}
