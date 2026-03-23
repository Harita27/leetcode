class Solution {
    public int countBattleships(char[][] board) {
        int R= board.length;
        int C= board[0].length;
        boolean[][]visited= new boolean[R][C];
        int count=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j]=='X' && !visited[i][j]){
                    dfs(board,i,j,visited,R,C);
                    count++;
                }
            }
        }
        return count;
    }
    int[][] diff=new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
    void dfs(char[][]board, int row, int col, boolean[][]visited,int R,int C){
        if(board[row][col]!='X'){
            return;
        }
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0&& adjC>=0 && adjR<R && adjC<C && board[adjR][adjC]=='X' && !visited[adjR][adjC]){
                visited[adjR][adjC]=true;
                dfs(board,adjR,adjC,visited,R,C);
            }

        }   
    }
}