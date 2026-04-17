/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> list=new ArrayList<>();
        dfs(list,root,target,new ArrayList<>());
        return list;
    }
    public void dfs(List<List<Integer>> res,TreeNode root,int target,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        if(root.left==null && root.right==null && target-root.val==0){
            res.add(new ArrayList<>(list));
        }
        else{
            dfs(res,root.left,target-root.val,list);
            dfs(res,root.right,target-root.val,list);
        }
        list.remove(list.size()-1);

    }
}