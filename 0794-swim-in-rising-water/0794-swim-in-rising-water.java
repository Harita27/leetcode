class Solution {
    public int swimInWater(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int[][] diff=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] visited=new boolean[R][C];
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->a[2]-b[2]);
        heap.add(new int[]{0,0,grid[0][0]});
        int maxht=grid[0][0];
        visited[0][0]=true;
        while(!heap.isEmpty()){
            int cell[]=heap.poll();
            int row=cell[0];
            int col=cell[1];
            int ht=cell[2];
            maxht=Math.max(maxht,ht);
            if(row==R-1 && col==C-1){
                break;
            }
            for(int i=0;i<4;i++){
                int adjR=row+diff[i][0];
                int adjC=col+diff[i][1];
                if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && !visited[adjR][adjC]){
                    heap.add(new int[]{adjR,adjC,grid[adjR][adjC]});
                    visited[adjR][adjC]=true;
                }
            }


        }
        return maxht;
    }
}