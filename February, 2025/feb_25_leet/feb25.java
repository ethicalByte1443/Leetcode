class feb25 {
    public int maxAbsoluteSum(int[] nums) {
        int max_sum = 0, min_sum = 0, max_ending_here = 0, min_ending_here = 0;

        for (int num : nums) {
            max_ending_here += num;
            min_ending_here += num;

            max_sum = Math.max(max_sum, max_ending_here);
            min_sum = Math.min(min_sum, min_ending_here);

            if (max_ending_here < 0) max_ending_here = 0;
            if (min_ending_here > 0) min_ending_here = 0;
        }

        return Math.max(max_sum, Math.abs(min_sum));
    }
}