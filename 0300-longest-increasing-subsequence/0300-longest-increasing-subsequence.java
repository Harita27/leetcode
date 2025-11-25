class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] freq=new int[nums.length];
        int max=0;
        for(int ind1=0;ind1<nums.length;ind1++){
            for(int ind2=0;ind2<ind1;ind2++){
                if(nums[ind1]>nums[ind2])
                freq[ind1]=Math.max(freq[ind1],freq[ind2]+1);
                max=Math.max(max,freq[ind1]);
            }

        }
        for(int i=0;i<nums.length;i++){
            System.out.print(freq[i]+" ");
        }
        return max+1;
        
    }
}