class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rem,sum=0;
        int or=x;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        return(sum==or);
    }
}
