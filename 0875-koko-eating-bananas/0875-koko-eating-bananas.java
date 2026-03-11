class Solution {
    public int minEatingSpeed(int[] piles, int hours) {
        int low=1;
        int high=piles[0];
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        while(low<high){
                int mid=low+(high-low)/2;
                int h=0;
                for(int p:piles){
                    h+=(p+mid-1)/mid;
                }
                if(h<=hours){
                    high=mid;
                }
                else low=mid+1;

        }
        return high;

    }
}