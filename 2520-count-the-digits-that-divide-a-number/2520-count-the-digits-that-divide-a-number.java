class Solution {
    public int countDigits(int num) {
        int n=num;
        int c=0;
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        while(n>0){
            int temp=n%10;
            minheap.add(temp);
            n=n/10;
        }
        while(!minheap.isEmpty()){
            int r=minheap.poll();
            if(num%r==0){
                c++;
            }
            else continue;
        }
        return c;
    }
}