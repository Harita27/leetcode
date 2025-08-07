class Solution {
    public String longestPalindrome(String word) {
        int n = word.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;
        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        // Check substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        // Check substrings of length 3 and more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (word.charAt(i) == word.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        return word.substring(start, start + maxLength);
    }
}
