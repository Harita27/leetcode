class Solution {
    public int countEven(int num) {
        int sum=0,n=num;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        int k=0;
        if(sum%2==0){
            k=num/2;
        } else k=(num-1)/2;
        return k;
    }
}