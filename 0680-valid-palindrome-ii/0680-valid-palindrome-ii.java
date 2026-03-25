class Solution {
    public boolean skipPossible(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else return false;
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return skipPossible(s,l+1,r)||skipPossible(s,l,r-1);
            }
        }
        return true;
    }
}