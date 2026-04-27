class Solution {
    public int reverse(int x) {
        int sum=0;
        while(x!=0){
            int temp=x%10;
            if(sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0; 
            }
            if(sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0; 
            }
            sum=sum*10+temp;
            x/=10;
        }
        return sum;
    }
}