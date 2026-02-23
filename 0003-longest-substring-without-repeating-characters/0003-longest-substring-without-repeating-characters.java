class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb=new StringBuilder();
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                while(map.get(ch)>0){
                    char c=sb.charAt(0);
                    map.put(c,map.get(ch)-1);
                    sb.deleteCharAt(0);
                }
            }
            sb.append(ch);            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max=Math.max(max,sb.length());
        }
        return max;
    }
}