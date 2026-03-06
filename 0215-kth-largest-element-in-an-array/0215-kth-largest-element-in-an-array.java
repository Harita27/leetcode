class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            maxheap.add(num);
        }
        int ans=-1;
        for(int i=0;i<k;i++){
            ans=maxheap.poll();
        }
        return ans;
    }
}