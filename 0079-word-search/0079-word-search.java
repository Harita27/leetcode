class Solution {
    int[][] diff=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public boolean dfs(char[][] board, String word,int R, int C, int row, int col, boolean[][] visited,int ind){
        visited[row][col]=true;
        if(ind==word.length()) return true;
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C  && !visited[adjR][adjC]){
                if(board[adjR][adjC]==word.charAt(ind)){
                    boolean fl=dfs(board,word,R,C,adjR,adjC,visited,ind+1);
                    if(fl) return true;
                }
            }
        }
        visited[row][col]=false;
        return false;
    } 
    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        boolean fl=false;
        boolean[][] visited=new boolean[R][C];
        int ind=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]==word.charAt(0)){
                    visited[row][col]=true;
                    fl=dfs(board,word,R,C,row,col,visited,ind+1);
                    if(fl) return true;
                }
            }
        }
        return fl;
    }
}