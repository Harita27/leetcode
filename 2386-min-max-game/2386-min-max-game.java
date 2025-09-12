class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        int nNums[] = new int[n / 2];
        int j = 0;
        boolean flag = true;
        for(int i = 0 ; i < n; i += 2)
        {
            int temp = 0;
            if(flag)
                temp = Math.min(nums[i], nums[i + 1]);
            else
                temp = Math.max(nums[i] , nums[i + 1]); 
            flag = !flag;
            nNums[j++] = temp;
        }
        return minMaxGame(nNums);
    }
}
