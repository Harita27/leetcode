class Solution {
    public int minCost(int[] nums, int k) {
        int n= nums.length;
        int[]dp= new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]= 0;
        for(int i=0;i<n;i++){
            Map<Integer, Integer> map= new HashMap<>();
            int cost=0;
            for(int j=i;j<n;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.get(nums[j])==2) cost+=2;
                if(map.get(nums[j])>2)  cost++;
                dp[j+1]= Math.min(dp[j+1],dp[i]+cost+k);
            }
        }
        return dp[n];
    }
}