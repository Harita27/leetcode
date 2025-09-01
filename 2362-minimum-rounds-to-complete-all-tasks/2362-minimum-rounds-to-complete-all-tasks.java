class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==1) return -1;
            c+=map.get(key)/3;
            if(map.get(key)%3!=0) c++;
        }
        return c;
    }
}