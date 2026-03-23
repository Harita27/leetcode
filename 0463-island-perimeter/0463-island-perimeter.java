class Solution {
    int diff[][]={{-1,0},{1,0},{0,1},{0,-1}};
    int p=0;
    public void dfs(int[][] grid,int R,int C, int row, int col){
         if(row<0 || row>=R || col<0 || col>=C){
            p++; return;
         }
         if(grid[row][col] == 0){
            p++;
            return;
        }
         if(grid[row][col]==-1) return;
         grid[row][col]=-1;


        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            dfs(grid,R,C,adjR,adjC);
            
        }
    }

    public int islandPerimeter(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    dfs(grid,R,C,i,j);
                }
            }
        }
        return p;
    }
}