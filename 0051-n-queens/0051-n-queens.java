class Solution {
    public boolean backtrack(int n,int r,boolean[] R,boolean C[],boolean Ldiag[], boolean Rdiag[],List<List<String>> result,char[][] board){
        if(r==n){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int c=0;c<n;c++){
                    if(board[i][c]=='Q'){
                        sb.append('Q');
                    }
                    else sb.append('.');
                }
                ans.add(sb.toString());
            }
            result.add(ans);
            return true;
        }
        for(int c=0;c<n;c++){
            if(R[r]==false && C[c]==false && Ldiag[r+c]==false && Rdiag[(n-1)-r+c]==false){
                R[r]=true;
                C[c]=true;
                Ldiag[r+c]=true;
                Rdiag[(n-1)-r+c]=true;
                board[r][c]='Q';
                boolean bool=backtrack(n,r+1,R,C,Ldiag,Rdiag,result,board);
                R[r]=false;
                C[c]=false;
                Ldiag[r+c]=false;
                Rdiag[(n-1)-r+c]=false;
                board[r][c]='.';
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result =new ArrayList<>();
        char[][] board=new char[n][n];
        boolean[] R=new boolean[n];
        boolean C[]=new boolean[n];
        boolean Ldiag[]=new boolean[2*n-1];
        boolean Rdiag[]=new boolean[2*n-1];
        boolean b=backtrack(n,0,R,C,Ldiag,Rdiag,result,board);
        return result;
    }
}