class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int len1=nums1.length;
      int len2=nums2.length;
      int[] nums=new int[len1+len2];
      int i1=0;
      int i2=0;
      for(int i=0;i<len1+len2;i++){
        if(i1<len1 && i2<len2){
            if(nums1[i1]<nums2[i2]){
                nums[i]=nums1[i1];
                i1++;
            }
            else{
                nums[i]=nums2[i2];
                i2++;
            }
        }else if(i1<len1){
            nums[i]=nums1[i1];
            i1++;
        }else if(i2<len2){
            nums[i]=nums2[i2];
            i2++;
        }
      }
      int size=len1+len2;
      if(size%2!=0) return((double)nums[size/2]);
      else return((nums[size/2]+nums[size/2-1])/2.0);
}
}