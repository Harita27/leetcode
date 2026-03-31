class Solution {
    public int change(int W, int[] coins) {
       int dp[]=new int[W+1];
       dp[0]=1;
       for(int i=0;i<coins.length;i++){
        for(int j=coins[i];j<=W;j++){
            if(j-coins[i]>=0)
            dp[j]+=dp[j-coins[i]];
        }
       }
       return dp[W];
    }
}