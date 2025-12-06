class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] st=sentences[i].split(" ");
            max=Math.max(st.length,max);
        }
        return max;
    }
}