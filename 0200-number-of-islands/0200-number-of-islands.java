class Solution {
    static int[][] diff=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
    private static void dfs(char[][] grid,int R,int C, int row, int col){
        if(grid[row][col]!='1') return;
        grid[row][col]='0';
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C&& grid[adjR][adjC]=='1'){
                dfs(grid,R,C,adjR,adjC);
            }
        }
    } 
    public int numIslands(char[][] grid) {
       int islands=0;
       int R=grid.length;
       int C=grid[0].length, count=0;
       for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            if(grid[row][col]=='1'){
                dfs(grid,R,C,row,col);
                count++;
            }
        }
       }
       return count;
    }
}