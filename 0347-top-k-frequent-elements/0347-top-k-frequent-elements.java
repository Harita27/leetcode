class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)-> Integer.compare(b[0],a[0]));
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] arr=new int[k];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(new int[]{entry.getValue(),entry.getKey()});
        }
        for(int i=0;i<k;i++){
            arr[i]=pq.poll()[1];
        }
        return arr;

    }
}