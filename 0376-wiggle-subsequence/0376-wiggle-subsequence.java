class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1) return 1;
        int prevdiff=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            int currdiff=nums[i]-nums[i-1];
            if(prevdiff>=0 && currdiff<0|| currdiff>0 && prevdiff<=0){
                count++;
                prevdiff=currdiff;
            }            
        }
        return count;
    }
}