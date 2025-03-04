import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        Map<String, Integer> dp = new HashMap<>();
        int maxLen = 0;

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < k; j++) {
                int prev = arr[k] - arr[j]; 
                if (prev < arr[j] && indexMap.containsKey(prev)) {
                    int i = indexMap.get(prev); 
                    String key = i + "," + j;
                    int currLen = dp.getOrDefault(key, 2) + 1;
                    dp.put(j + "," + k, currLen);
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }

        return maxLen;
    }
}