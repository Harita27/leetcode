class Solution {
    private static int countone(int[] hist){
        int res=0;
        for(int i=0;i<hist.length;i++){
            int minh=hist[i];
            for(int j=i;j>=0;j--){
                minh=Math.min(hist[j],minh);
                res+=minh;
            }
        }
        return res;
    }
    public int numSubmat(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        int[] hist=new int[C];
        int total=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(mat[i][j]==0){
                    hist[j]=0;
                }
                else hist[j]+=1;
            }
            total+=countone(hist);
        }
        return total;
    }
}