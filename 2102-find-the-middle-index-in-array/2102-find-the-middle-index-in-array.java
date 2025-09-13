class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int leftsum=0,rightsum=0;
        for(int i: nums){
            sum+=i;
        }    
        for(int i=0; i<nums.length; i++)
        {
            if(i==nums.length-1){
                rightsum=0;
            }
            else{
                rightsum = sum-nums[i]-leftsum;
            }    
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}