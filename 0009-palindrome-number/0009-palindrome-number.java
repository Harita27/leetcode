class Solution {
    public boolean isPalindrome(int x) {
        int rem;
        int temp=x;
        long sum=0;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(temp>=0)
        return(temp==sum);
        else
        return(false);
    }
}
