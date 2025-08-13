class Solution {
    public int trap(int[] height) {
        int water=0;
       int left=0;
       int right=height.length-1;
       int maxleft=0,maxright=0;
       while(left<right){
        maxleft=Math.max(height[left],maxleft);
        maxright=Math.max(height[right],maxright);
        if(maxleft<maxright){
            water+=maxleft-height[left];
            left++;
        }
        else{
            water+=maxright-height[right];
            right--;
        }
       }
       return water;
}
}