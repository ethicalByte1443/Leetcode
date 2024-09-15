from typing import List


class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        max_val = max(nums)
        
        # Step 2: Iterate through nums to find the longest subarray of max_val
        longest = 0
        current_length = 0
        
        for num in nums:
            if num == max_val:
                current_length += 1
                longest = max(longest, current_length)
            else:
                current_length = 0
        
        return longest