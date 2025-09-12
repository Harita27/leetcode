class Solution {
    public String finalString(String s) {
        StringBuilder st=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='i'){
                st.reverse();
            }
            else st.append(ch);
        }
        return st.toString();
    }
}