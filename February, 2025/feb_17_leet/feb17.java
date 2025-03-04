class feb17 {
    public static int numTilePossibilities(String tiles) {
        int[] freq = new int[26]; // Frequency array for letters A-Z

        for (char ch : tiles.toCharArray()) {
            freq[ch - 'A']++;
        }

        return backtrack(freq);
    }

    private static int backtrack(int[] freq) {
        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;

                freq[i]--;
                count += backtrack(freq);

                freq[i]++;
            }
        }

        return count;
    }
}