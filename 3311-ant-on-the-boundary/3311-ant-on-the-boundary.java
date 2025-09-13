class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
            if(nums[i]==0)
            ans++;
        }
        return ans;
    }
}