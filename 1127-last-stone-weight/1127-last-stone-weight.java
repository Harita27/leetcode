class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int ston:stones){
            queue.add(ston);
        }

        while(queue.size()>1){
            int x=queue.poll();
            int y=queue.poll();

            if(x>y) queue.add(x-y);
        }
        return queue.isEmpty()? 0:queue.peek();
    }
}