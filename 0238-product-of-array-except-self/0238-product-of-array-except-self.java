class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pf=new int[nums.length];
        int sf[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int n=nums.length;
        pf[0]=1;
        sf[n-1]=1;
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=pf[i]*sf[i];
        }
        return ans;

    }
}