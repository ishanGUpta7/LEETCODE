Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

Sol.
as we need boolean typr of answer for this we need a new  function called height which would calculate the the left heights
and right height of the tree  is the difference in the height of both side is less than equal to one the its true else false,


class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int rh = height(root.right);
        int lh = height(root.left);
        if((Math.abs(lh - rh)<=1 && isBalanced(root.left)&& isBalanced(root.right))){
            return true;
        }
        return false;
    }
      public int height(TreeNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
