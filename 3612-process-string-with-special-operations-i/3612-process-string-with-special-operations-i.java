class Solution {
    public String processStr(String s) {
        StringBuilder st=new StringBuilder();;
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c>='a' && c<='z'){
                st.append(c);
            }
            if(c=='*'  && st.length()!=0){
                st.deleteCharAt(st.length() - 1);
            }
            if(c=='#'){
                st.append(st.toString());
            }
            if(c=='%'){ 
                st.reverse();
            }
        }
        return st.toString();

    }
}