class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            set.add(nums[i]);
        }
        int i=0;
        for(i=1;i<nums.length+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return i;
    }
}