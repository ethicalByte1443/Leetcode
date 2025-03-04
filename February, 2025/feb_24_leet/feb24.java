class feb24 {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;

        int oddCount = 0;   
        int evenCount = 1;  
        int prefix = 0;     
        int count = 0;      

        for (int num : arr) {
            prefix += num;

            if (prefix % 2 != 0) {
                count = (count + evenCount) % MOD;  
                oddCount++;
            } else {
                count = (count + oddCount) % MOD;  
                evenCount++;
            }
        }

        return count;
    }
}