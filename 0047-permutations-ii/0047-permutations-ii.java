class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),new boolean[nums.length]);
        return res;        
    }
    public void backtrack(int[] nums,List<Integer> list,boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;            
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i-1]==nums[i] && !used[i-1]) continue;

            list.add(nums[i]);
            used[i]=true;
            backtrack(nums,list,used);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}