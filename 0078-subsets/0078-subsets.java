class Solution {
    List<List<Integer>> res=new ArrayList<>();
    private void subset(int[] nums,int i,List<Integer> list){
        if(i==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        subset(nums,i+1,list);
        list.remove(list.size()-1);
        subset(nums,i+1,list);

    }
    public List<List<Integer>> subsets(int[] nums) {
        subset(nums,0,new ArrayList<>());
        return res;
    }
}