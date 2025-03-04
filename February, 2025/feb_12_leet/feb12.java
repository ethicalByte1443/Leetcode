class Solution {
    public static int countDigit(int num){
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num/=10;
        }

        return sum;
    }
    public int maximumSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> set = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sumofdigit = countDigit(nums[i]);
            if(set.containsKey(sumofdigit)){
                if(max < nums[i] + nums[set.get(sumofdigit)]){
                    max = nums[i] + nums[set.get(sumofdigit)];
                }

                if(nums[set.get(sumofdigit)] < nums[i]){
                    set.put(sumofdigit, i);
                }
            }
            else{
                set.put(sumofdigit, i);
            }
        }

        if(max == Integer.MIN_VALUE)
            return -1;
        return max;
    }
}