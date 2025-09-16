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
    private static List<Integer> res=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        res.clear();
        traverse(root);
        return res.get(k-1);
    }
    private static void traverse( TreeNode root){
        if(root==null){
            return;
        }
        else{
            traverse(root.left);
            res.add(root.val);
            traverse(root.right);
        }
        return;
    }
}