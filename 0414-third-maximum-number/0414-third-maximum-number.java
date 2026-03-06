class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            maxheap.add(num);
        }
        if(set.size()<3){
            return maxheap.peek();
        }
        int ans=-1;
        for(int i=0;i<3;i++){
            ans=maxheap.poll();
        }
        return ans;
    }
}