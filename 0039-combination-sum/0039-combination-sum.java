class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>());
        return res;
    }
    public void backtrack(int[] c,int t,int ind,List<Integer> list){
        if(t==0){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=ind;i<c.length;i++){
            if(c[i]>t){
                break;
            }
            list.add(c[i]);
            backtrack(c,t-c[i],i,list);
            list.remove(list.size()-1);
        }
    }
}