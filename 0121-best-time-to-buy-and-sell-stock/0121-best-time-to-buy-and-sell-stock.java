class Solution {
    public int maxProfit(int[] price) {
        int min=price[0];
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]<min){
                min=price[i];
            }
            else profit=Math.max(profit,price[i]-min);
        }
        return profit;
    }
}