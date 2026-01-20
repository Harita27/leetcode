class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int n:nums){
            min.add(n);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=min.poll();
        }
        return;
    }
}