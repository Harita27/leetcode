class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num:nums){
            minheap.add(num);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=minheap.poll();
        }
    }
}