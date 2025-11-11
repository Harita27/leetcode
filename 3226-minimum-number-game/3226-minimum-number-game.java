class Solution {
    public int[] numberGame(int[] nums) {
        int arr[]=new int[nums.length];
        Queue<Integer> min=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            min.add(nums[i]);
        }
        for(int i=0;i<nums.length-1;i+=2){
            arr[i+1]=min.poll();
            arr[i]=min.poll();
            if(i+1==nums.length){
                return arr;
            }
        }
        return arr;
    }
}