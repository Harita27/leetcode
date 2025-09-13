class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int[] diff=new int[n];
        for (int i=0;i<n;i++){
            Set<Integer> prefixSet = new HashSet<>();
            Set<Integer> suffixSet = new HashSet<>();
            for (int j=0;j<=i;j++) {
                prefixSet.add(nums[j]);
            }            
            for (int j=i+1;j<n;j++) {
                suffixSet.add(nums[j]);
            }
            diff[i]=-suffixSet.size()+prefixSet.size();
        }
        
        return diff;
    }
}