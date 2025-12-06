class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String st=words[i];
            StringBuilder sb=new StringBuilder(st).reverse();
            if(st.equals(sb.toString())) return st;

        }
        return "";
    }
}