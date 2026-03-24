class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:jewels.toCharArray()){
            map.put(ch,1);
        }
        int sum=0;
        for(char ch:stones.toCharArray()){
            if(map.containsKey(ch)){
                sum+=1;
            }
        }
        return sum;
    }
}