class Solution {
    public int waysToReachTarget(int target, int[][] types) {
        int[][] dp=new int[types.length+1][target+1];
        int mod=1000000007;
        for(int i=0;i<=types.length;i++){
            dp[i][0]=1;
        }
       for (int i = 1; i <= types.length; i++) {
            int count = types[i - 1][0];
            int mark = types[i - 1][1];

            for (int j = 0; j <= target; j++) {

                // Not take
                dp[i][j] = dp[i - 1][j];

                // Take k items
                for (int k = 1; k <= count; k++) {
                    if (j - k * mark >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - k * mark]) % mod;
                    } else {
                        break;
                    }
                }
            }
        }
        return dp[types.length][target];    
    }
}