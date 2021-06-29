226. Invert Binary Tree

Explanation  1.The solution is a simple recursive approach:
Call invert for left-subtree.
Call invert for right-subtree.
Swap left and right subtrees.


Code(java)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        helper(root);//calling a helper function where all the oeration takes place
        return root;
    }
    public void helper(TreeNode n){
        if (n==null){//base class
            return;
        }
        TreeNode temp = n.left;
        n.left=n.right;
        n.right=temp;

        helper(n.left);
        helper(n.right);
    }
}
