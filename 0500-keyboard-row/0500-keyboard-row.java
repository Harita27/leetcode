class Solution {
    private boolean isinrow(String s,String row){
        for(char c:s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c))==-1){
                return false;
            }
        }
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        for(String word:words){
            if(isinrow(word,s1)||isinrow(word,s2)||isinrow(word,s3)) ans.add(word);
        }
        return ans.toArray(new String[0]);
    }
}