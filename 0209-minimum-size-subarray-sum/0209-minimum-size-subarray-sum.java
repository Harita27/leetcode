class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int max=Integer.MAX_VALUE;
        int len=nums.length;
        int sum=0;
        for(int right=0;right<len;right++){
            sum+=nums[right];
            while(sum>=target){
                max=Math.min(max,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(max==Integer.MAX_VALUE) return 0;
        else return max;
    }
}