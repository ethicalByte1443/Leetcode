class Solution:
    def findTheLongestSubstring(self, s: str) -> int:
        n = len(s)
        mask = 0
        maxLength = 0
        m = {0: -1}
        
        for i in range(n):
            if s[i] == 'a':
                mask ^= (1 << 0)
            elif s[i] == 'e':
                mask ^= (1 << 1)
            elif s[i] == 'i':
                mask ^= (1 << 2)
            elif s[i] == 'o':
                mask ^= (1 << 3)
            elif s[i] == 'u':
                mask ^= (1 << 4)
            
            if mask in m:
                maxLength = max(maxLength, i - m[mask])
            else:
                m[mask] = i
        
        return maxLength