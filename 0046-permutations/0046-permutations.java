class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,new ArrayList<>(),new HashSet<>());
        return res;
    }
    public void backtrack(int[] nums,List<Integer> list,HashSet<Integer> set){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                list.add(nums[i]);
                set.add(nums[i]);
                backtrack(nums,list,set);
                list.remove(list.size()-1);
                set.remove(nums[i]);
            }
        }
    }
}