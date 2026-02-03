class Solution {
    public int trap(int[] height) {
        int maxwater=0;
        int left=0; int right=height.length-1;
        int maxleft=0;int maxright=0;
        while(left<right){
            maxleft=Math.max(maxleft,height[left]);
            maxright=Math.max(maxright,height[right]);
            if(maxleft<maxright){
                maxwater+=maxleft-height[left];
                left++;
            }
            else{ maxwater+=maxright-height[right]; right--;
            }
        }
        return maxwater;
    }
}