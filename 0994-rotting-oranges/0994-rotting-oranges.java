class Solution {
    
    public int orangesRotting(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        Queue<int[]> que=new LinkedList();
        boolean[][] visited=new boolean[R][C];
        int oranges=0;int count=-1;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]!=0){
                    if(grid[row][col]==2){
                        visited[row][col]=true;
                        que.add(new int[]{row,col});
                    }
                    oranges++;
                }
            }
        }
        if(oranges==0){
            return 0;
        }
        int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        while(!que.isEmpty()){
            int size=que.size();
            count++;
            for(int i=0;i<size;i++){
                int[] cell=que.poll();
                oranges--;
                int row=cell[0];
                int col=cell[1];
                for(int ind=0;ind<4;ind++){
                    int adjR=row+diff[ind][0];
                    int adjC=col+diff[ind][1];
                    if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && !visited[adjR][adjC] && grid[adjR][adjC]==1){
                        visited[adjR][adjC]=true;
                        que.add(new int[]{adjR,adjC});
                    }
                }
            }
        }
        if(oranges>0) return -1;
        else return count;

                
    }
}