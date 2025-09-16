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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        traverse(root, val);
        return root;
    }

    private void traverse(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);

        if (root.val > val) {
            // Go left
            if (root.left == null) {
                root.left = temp;
                return;
            } else {
                traverse(root.left, val);
            }
        } else {
            // Go right
            if (root.right == null) {
                root.right = temp;
                return;
            } else {
                traverse(root.right, val);
            }
        }
    }
}


