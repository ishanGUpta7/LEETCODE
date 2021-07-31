Q.Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
  A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.


Solution:-  so we wil use binary searh and divide into two part leaving the middle node is the primary root.








  class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return answer(nums,0,nums.length-1);
    }
    public TreeNode answer(int[] nums, int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left=answer(nums,start,mid-1);
        node.right=answer(nums,mid+1,end);
        return node;
    }
}
