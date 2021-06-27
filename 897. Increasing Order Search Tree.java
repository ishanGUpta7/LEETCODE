I have more than one approach for this question so just SCROLLLL!!!!!!.


Q.Given the root of a binary search tree, rearrange the tree in in-order so that
the leftmost node in the tree is now the root of the tree, and every node has
no left child and only one right child.

--------------------------ANS:-APPROACH 1 :----------------------------------
so the approach that I am using here is that
     1. We would create an empty arraylist.
     2. then we would use the inorder traversal through the binary search tree.
     3. We would start with the leftmost element in list and continue as per the
        inorder traversal.
     4. the first element of the list would be the root of our new increasing
         order tree and then put the remaining elements to the right of the
         root.

Code in Java
class Solution {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> z = new ArrayList<Integer>();//created an empty arraylist
        inorder(root,z);//called a function inorder which would traverse through bst.
        TreeNode result = new TreeNode(z.get(0));//created a dummynode result which will store our new root
        TreeNode ans = result;//new node which will store the right element of new bst
        for(int i=1;i<z.size();i++){//for loop to traverse through the list and create new BST
          ans.right = new TreeNode(z.get(i));//imp:- we started with i =1 bcz i=0 is already stored in result node as root
          ans=ans.right;
        }return result;
    }
      public void inorder(TreeNode node,List<Integer> z){//simple inorder traversal
      if (node==null){
        return;}
        inorder(node.left,z);
        z.add(node.val);//added traversal values to list
        inorder(node.right,z);

    }
}
