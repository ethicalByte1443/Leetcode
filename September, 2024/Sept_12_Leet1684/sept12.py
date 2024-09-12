# Approach 1

from typing import List


class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count = 0
        for i in words:
            flag = 0
            for char in i:
                if char in allowed:
                    flag = 0
                else:
                    flag = 1
                    break
            if flag == 0:
                count = count+1
        return count 
    
# Approach 2

class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowed_set = set(allowed)  # O(1) lookup for allowed characters
        count = 0
        
        for word in words:
            
            if all(char in allowed_set for char in word):
                count += 1
                
        return count