class Solution:
    def minLength(self, s: str) -> int:
        while s.find('AB')>-1 or s.find('CD')>-1:
            if s.find('AB')>-1:
                s = s.replace("AB", '')
            if s.find('CD')>-1:
                s = s.replace("CD", '')
        return len(s)
        