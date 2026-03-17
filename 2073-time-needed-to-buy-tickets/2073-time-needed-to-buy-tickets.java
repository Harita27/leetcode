class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new LinkedList<>();
        int t=0;
        for(int i=0;i<tickets.length;i++){
            q.offer(new int[]{i,tickets[i]});
        }
        while(!q.isEmpty()){
            t++;
            int cell[]=q.poll();
            cell[1]--;
            if(cell[1]==0 && cell[0]==k){
                return t;
            }
            else if(cell[1]!=0) q.offer(cell);
        }
        return t;

    }
}