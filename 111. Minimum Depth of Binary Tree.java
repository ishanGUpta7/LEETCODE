Q..Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
Sol:-so what we have to do is take base condition first which is if root is null. so now check if first right or left element is null then
head to its oppossite child. then iterate through the list taking two variables which will store the depth and then we return min of the two .




class Solution {
    public int minDepth(TreeNode root) {
         if(root == null){
            return 0;
        }
        if (root.left == null)
            return minDepth(root.right) + 1;
          if (root.right == null)
            return minDepth(root.left) + 1;
        int ldepth= minDepth(root.left);
        int rdepth= minDepth(root.right);
        if(ldepth>rdepth){
            return rdepth+1;
        }          else{
                return ldepth+1;
            }
    }
}
