965. Univalued Binary Tree
Q...A binary tree is univalued if every node in the tree has the same value.
    Return true if and only if the given tree is univalued.
    Explanation:-
    1.firstly create an arraylist to store all the values of bst.
    2.second call a function inorder which would traverse the bst and store the value in list.
    3.now start a for loop which would call the value stored in list and compareit with next element of the list.

CODE in Java
class Solution {
    public boolean isUnivalTree(TreeNode root) {
    List<Integer> z = new ArrayList<Integer>();
        inorder(root,z);
        int n = z.size();
        for (int i=0; i<n-1; i++){
            if(z.get(i)!=z.get(i+1)){
                return false;
            }

        }
        return true;
    }
    public void inorder(TreeNode root,List<Integer> z){
        if(root==null){
            return;
    }inorder(root.left,z);
          z.add(root.val);
        inorder(root.right,z);
    }

}
