class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=0;
        int max=Integer.MAX_VALUE;
        int j=0;
        int i=0;
        int f=0;
        int n=nums.length;
        while(i<n){
            
                count+=nums[i];
                i++;
            
            
                while(count>=target ){
                    max=Math.min(max,i-j);
                    count-=nums[j];
                    j++;
                }
                
            
        }
        if(max==Integer.MAX_VALUE) return 0;
        return max;
    }
}