class Solution {
    public String reverseWords(String sp) {
        String[] s=sp.split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            st.append(s[i]).append(" ");
        }
        return st.toString().trim();
        
    }
}