Q..Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all
the values along the path equals targetSum. A leaf is a node with no children.

Sol...the point is we traverse the tree and subtract the root value from given sum and continue this process ubt leaf is reached 
sum=0 and when that node is = leaf node..




class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        else if(root.left==null && root.right==null && root.val-targetSum==0){
            return true;

        }
        else{
            return(hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val));
        }
