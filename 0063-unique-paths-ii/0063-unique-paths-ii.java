class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int[][] dp=new int[R][C];
        for(int row=0;row<R;row++){
            if(grid[row][0]!=1){
                dp[row][0]=1;
            }
            else{
                break;
            }
        }
        for(int col=0;col<C;col++){
            if(grid[0][col]!=1){
                dp[0][col]=1;
            }
            else{
                break;
            }
        }
        for(int i=1;i<R;i++){
            for(int j=1;j<C;j++){
                if(grid[i][j]!=1) 
                   dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else dp[i][j]=0;
            }
        }
        return dp[R-1][C-1];
        
    }
}