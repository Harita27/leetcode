class Solution {
    public int maxh(int[] nums,int k){
        PriorityQueue<Integer> maxheap= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxheap.add(nums[i]);
        }
        int ki=0;
        for(int i=0;i<k;i++){
            ki=maxheap.poll();
        } 
        return ki;
    }
    public int minh(int[] nums,int k){
        PriorityQueue<Integer> minheap= new PriorityQueue<>();
        for (int num: nums){
            if(minheap.size()<k || minheap.peek()<num ){
                minheap.add(num);
            }
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.poll();
    }
    public int findKthLargest(int[] nums, int k) {
        if(k>nums.length/2){
            return minh(nums,k);
        }
        else{
            return maxh(nums,k);
        }
    }
}