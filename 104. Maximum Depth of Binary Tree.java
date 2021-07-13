Q..........Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



\Explanaton /  :- so take to variables l depth and r depth which would traverse the tree until they reach to null and store ther values.
As we need number of nodes so we have to add i to the resulr.

Code in java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ldepth= maxDepth(root.left);
        int rdepth= maxDepth(root.right);
        if(ldepth>rdepth){
            return ldepth+1;
        }          else{
                return rdepth+1;
            }

    }
}
