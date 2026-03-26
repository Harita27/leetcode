class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        backtrack(arr,k,0,new ArrayList<>());
        return res;
    }
    public void backtrack(int[] arr,int k,int ind,List<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            list.add(arr[i]);
            backtrack(arr,k,i+1,list);
            list.remove(list.size()-1);
        }
    }
}