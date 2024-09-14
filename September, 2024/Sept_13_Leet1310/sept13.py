class Solution(object):
    def xorQueries(self, arr, queries):
        """
        :type arr: List[int]
        :type queries: List[List[int]]
        :rtype: List[int]
        """
        mace = [0] * len(queries)
        for i in range(1, len(arr),1):
            arr[i] = arr[i-1] ^ arr[i]
        i = 0
        for sub in queries:
            left = sub[0]
            right = sub[1]
            if left != 0:
                mace[i] = arr[left-1] ^ arr[right]
            else:
                mace[i] = arr[right]
            i+=1
        return mace
        