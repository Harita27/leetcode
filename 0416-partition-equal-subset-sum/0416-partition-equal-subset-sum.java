class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i:nums) {
            sum+=i;
        }
        if (sum%2!=0) return false;
        int eqi = sum/2;
        boolean[][] dp = new boolean[nums.length+1][eqi+1];
        return knapsack(eqi,nums,dp);
    }

    public boolean knapsack(int target, int[] wt, boolean[][] dp) {
        int n = wt.length;
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j <= target; j++) {
            dp[0][j] = false; 
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                boolean pick = false;
                if (wt[i - 1] <= j) {
                    pick = dp[i - 1][j - wt[i - 1]];
                }
                boolean notpick = dp[i - 1][j];
                dp[i][j] = pick || notpick;
            }
        }
        return dp[n][target];
    }
}