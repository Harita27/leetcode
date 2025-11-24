class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder st=new StringBuilder();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            st.append(ch);
            while(map.get(ch)>1){
                map.put(st.charAt(0),map.get(st.charAt(0))-1);
                st.deleteCharAt(0);
            }
            max=Math.max(max,st.length());

        }
        return max;
    }
}