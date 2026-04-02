class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return LCS(text1,text2,n-1,m-1,dp);
    }
    public int LCS(String a,String b,int n,int m,int[][] dp){
        if(n<0||m<0){
            return 0;
        }if(dp[n][m]!=-1) return dp[n][m];
        if(a.charAt(n)==b.charAt(m)){
            return dp[n][m]=1+LCS(a,b,n-1,m-1,dp);
        }
        else return dp[n][m]=Math.max(LCS(a,b,n-1,m,dp),LCS(a,b,n,m-1,dp));
    }
}