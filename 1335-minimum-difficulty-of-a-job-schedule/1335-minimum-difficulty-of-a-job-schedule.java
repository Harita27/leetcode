class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) return -1;

        int[][] dp = new int[n][d + 1];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);

        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, jobDifficulty[i]);
            dp[i][1] = max;
        }

        for (int day = 2; day <= d; day++) {
            for (int i = day - 1; i < n; i++) {
                int currMax = 0;

                for (int j = i; j >= day - 1; j--) {
                    currMax = Math.max(currMax, jobDifficulty[j]);

                    if (dp[j - 1][day - 1] != Integer.MAX_VALUE) {
                        dp[i][day] = Math.min(dp[i][day],
                                dp[j - 1][day - 1] + currMax);
                    }
                }
            }
        }

        return dp[n - 1][d];
    }
}