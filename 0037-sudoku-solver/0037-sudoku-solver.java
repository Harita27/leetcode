class Cell{
    int row,col;
    public Cell(int r,int c){
        this.row=r; this.col=c;
    }
}
class Solution {
    private boolean solve(char[][] board,int[] rows,int[] cols,int[] subgrid){
        Cell tofill=getUnfilled(board);
        if(tofill==null) return true;
        for(int digit=1;digit<=9;digit++){
            int subind=3*(tofill.row/3)+tofill.col/3;
            if((rows[tofill.row]&(1<<digit))==0 && (cols[tofill.col]&(1<<digit))==0 && (subgrid[subind]&(1<<digit))==0){
                board[tofill.row][tofill.col]=(char)('0'+digit);
                rows[tofill.row]|=(1<<digit);
                cols[tofill.col]|=(1<<digit);
                subgrid[subind]|=(1<<digit);
                boolean solved=solve(board,rows,cols,subgrid);
                if(solved) return true;
                board[tofill.row][tofill.col]='.';
                rows[tofill.row]^=(1<<digit);
                cols[tofill.col]^=(1<<digit);
                subgrid[subind]^=(1<<digit);
            }
           
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        int[] rows=new int[9];
        int[] cols=new int[9];
        int[] subgrid=new int[9];
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]!='.'){
                    int digit=board[row][col]-'0';
                    int subind=3*(row/3)+(col/3);
                    rows[row]|=(1<<digit);
                    cols[col]|=(1<<digit);
                    subgrid[subind]|=(1<<digit);
                }
            }
        }
        solve(board,rows,cols,subgrid);
    }
    private static Cell getUnfilled(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.') return new Cell(row,col);
            }
        }
        return null;

    }
}