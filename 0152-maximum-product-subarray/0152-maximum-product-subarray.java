class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            int tempmax=Math.max(num,Math.max(min*num,max*num));
            int tempmin=Math.min(num,Math.min(min*num,max*num));
            max=tempmax;
            min=tempmin;
            res=Math.max(res,max);
        }
        return res;


    }
}