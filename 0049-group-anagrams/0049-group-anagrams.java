class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String bfr=strs[i];
            char[] ch=bfr.toCharArray();
            Arrays.sort(ch);
            String aft=new String(ch);
            if(!map.containsKey(aft)){
                map.put(aft,new ArrayList<>());
            }map.get(aft).add(bfr);
        }
        return new ArrayList<>(map.values());
         
    }
}