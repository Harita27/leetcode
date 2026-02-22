class Solution {
    public int mySqrt(int x){
        if(x<=1) return x;
        int low=0,high=x-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid<x){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1; 
        }
        return ans;
    }
}