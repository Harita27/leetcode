class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroinfirstrow=false;
        boolean zeroinfirstcol=false;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==0){
                    if(row==0){
                        zeroinfirstrow=true;
                    }
                    if(col==0){
                        zeroinfirstcol=true;
                    }
                    matrix[row][0]=0;
                    matrix[0][col]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if (matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }
        if(zeroinfirstrow){
            for (int col=0;col<matrix[0].length;col++) {
                matrix[0][col]=0;
            }
        }
        if(zeroinfirstcol){
            for (int row=0;row<matrix.length;row++) {
                matrix[row][0]=0;
            }
        }
    }
}