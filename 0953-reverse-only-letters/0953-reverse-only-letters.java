class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder st=new StringBuilder();
        StringBuilder st2=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                st.append(ch);
            }
        }
        st.reverse();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                st2.append(st.charAt(j++));
            }
            else st2.append(s.charAt(i));
        }
        return st2.toString();
    }
}