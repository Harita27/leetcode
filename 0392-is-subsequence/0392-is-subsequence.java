class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(s.length()==0) return (1==1);
        while(j<t.length() && i < s.length()){
            if(s.charAt(i)==t.charAt(j))
            i++;
            j++;
        }
        return (s.length()==i);    
    }
}