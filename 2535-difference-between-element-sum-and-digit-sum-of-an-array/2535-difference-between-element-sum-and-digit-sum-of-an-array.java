class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            if(nums[i]>=10){
                int k=nums[i];
                while(k>0){
                    sum2+=k%10;
                    k/=10;
                }
            }
            else sum2+=nums[i];
        }
        System.out.print(sum1 +" "+sum2);
        return Math.abs(sum1-sum2);
        
    }
}