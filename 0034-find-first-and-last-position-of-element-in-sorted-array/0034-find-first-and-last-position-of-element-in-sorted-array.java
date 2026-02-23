class Solution {
    public int[] searchRange(int[] nums, int target) {
        int one=range(nums,target,true);
        int two=range(nums,target,false);
        return new int[]{one,two};
    }
    public int range(int nums[],int target,boolean flag){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
            if(flag){
                high=mid-1;
            }
            else low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}