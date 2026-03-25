class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i=0,j=0;
        long s1=0,s2=0;
        long MOD=1000000007;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                s1+=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                s2+=nums2[j];
                j++;
            }
            else{
                s1=s2=Math.max(s1,s2)+nums1[i];
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            s1+=nums1[i];
            i++;
        }
        while(j<nums2.length){
            s2+=nums2[j];
            j++;
        }
    return (int)(Math.max(s1,s2)%MOD);
    }
}