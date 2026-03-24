class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        char[] chp=p.toCharArray();
        Arrays.sort(chp);
        int k=p.length();
        for(int i=0;i<=s.length()-k;i++){
            String st=s.substring(i,i+k);
            char[] cht=st.toCharArray();
            Arrays.sort(cht);
            if(Arrays.equals(cht,chp)) list.add(i);
        }
        return list;
    }
}