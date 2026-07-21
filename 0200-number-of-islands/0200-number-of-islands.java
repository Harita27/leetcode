class Solution {
    static int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    private static void dfs(char[][] grid,int R,int C, int row, int col){
        grid[row][col]='0';
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR<R && adjR>=0 && adjC>=0 && adjC<C){
             if(grid[adjR][adjC]=='1')
                dfs(grid,R,C,adjR,adjC);
            }
        }    
    } 
    public int numIslands(char[][] grid) {
       int c=0;
       int R=grid.length;
       int C=grid[0].length;
       for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(grid[i][j]=='1'){
                dfs(grid,R,C,i,j);
                c++;
            }
        }
       }
       return c;
       
    }
}