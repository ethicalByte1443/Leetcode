class Solution:
    def getHappyString(self, n: int, k: int) -> str:
        res = ['_' for _ in range(n + 1)]
        latters = ('a', 'b', 'c')

        min_k, max_k = 0, 0
        for pos in range(1, n + 1):
            for l in  latters:
                if l != res[pos - 1]:
                    min_k = max_k + 1
                    max_k += 2**(n - pos)
            
                    if min_k <= k and k <= max_k:
                        max_k = min_k - 1
                        res[pos] = l
                        break
            
            if res[pos] == '_':
                return ''
        
        return ''.join(res[1:])