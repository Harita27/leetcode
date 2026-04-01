class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)  return true;
        boolean check= false;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node= q.poll();
            if(node==null){
                check= true;
            }
            else{
                if(check){
                    return false;
                }
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return true;
    }
}