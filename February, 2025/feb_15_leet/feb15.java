class feb15 {
    public static boolean partition(String sq, int n, int currentSum) {
        if (sq.isEmpty()) {
            return currentSum == n;
        }

        for (int i = 1; i <= sq.length(); i++) {
            int part = Integer.parseInt(sq.substring(0, i));
            if (partition(sq.substring(i), n, currentSum + part)) {
                return true;
            }
        }
        return false;
    }

    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (partition(String.valueOf(sq), i, 0)) {
                sum += sq;
            }
        }
        return sum;
    }
}