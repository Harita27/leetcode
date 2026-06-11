class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k){
            max=sum;
        }
        for(int i=k;i<nums.length;i++){
            int left=nums[i-k];
            map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                map.remove(left);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
             sum=sum-nums[i-k]+nums[i];
            if(map.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}