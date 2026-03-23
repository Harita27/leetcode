class Solution {
    int original=0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int R=image.length;
        int C=image[0].length;
        original=image[sr][sc];
        if(original==color) return image;
        dfs(image,sr,sc,R,C,color);
        return image;
    }
    int[][] diff=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public void dfs(int[][] image,int row,int col,int R,int C,int color){
        if(image[row][col]!=original ){
            return;
        }
        image[row][col]=color;
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0 && adjR<R && adjC<C && adjC>=0 && image[adjR][adjC]==original){
                dfs(image,adjR,adjC,R,C,color);
            }
        }
    }

}