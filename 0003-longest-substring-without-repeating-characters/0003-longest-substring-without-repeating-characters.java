class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder res=new StringBuilder();
        int len=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            res.append(ch);        
            while(map.get(ch)>1){
                map.put(res.charAt(0),map.get(res.charAt(0))-1);
                res.deleteCharAt(0);
            }
            len=Math.max(len,res.length());

        }
        return len;
    }
}