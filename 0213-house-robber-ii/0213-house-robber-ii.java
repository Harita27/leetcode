class Solution {
    public int rob(int[] nums){
        int n=nums.length;
        if(n==1) return nums[0];
        else if(n==2) return Math.max(nums[1],nums[0]);
        int case1=func(nums,0,n-2);
        int case2=func(nums,1,n-1);
        return Math.max(case1,case2);
    }
    public int func(int[] nums,int st,int end){
        int len=end-st+1;
        int dp[]=new int[len+1];
        for(int i=0;i<len;i++){
            int idx=st+i;
            if(i==0){
                dp[i]=nums[idx];
            }
            else if(i==1){
                dp[i]=Math.max(nums[idx-1],nums[idx]);
            }
            else dp[i]=Math.max(dp[i-1],dp[i-2]+nums[idx]);

        }
        return dp[len-1];
    }
}