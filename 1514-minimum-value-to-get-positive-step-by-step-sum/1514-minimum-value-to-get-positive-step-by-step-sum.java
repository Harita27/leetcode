class Solution {
    public int minStartValue(int[] nums) {
        int prefixsum=0,min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            prefixsum+=num;
            min=Math.min(min,prefixsum);
        }

        return (min<1)?Math.abs(min)+1:1; 
    }
}