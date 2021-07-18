872. Leaf-Similar Trees
Q..Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
  Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
................................SOL.......................................
so whats happening here is we are given two trees and we have to iterate through the whole tree and reach to the leaf node
and store them somewhere so that we could compare them .
  leaf nod is the node which dont have right and left subtree.
  so what we do is create two list and store the leafs of both the binary trees in different lists
  and then by using for loop compare them................


  code on java:-
  class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        inorder(root1,l1);
        outorder(root2,l2);
        if(l1.size()!=l2.size()){
            return false;
        }
        for(int i =0; i<l1.size();i++){
            if(l1.get(i)!=l2.get(i)){
                return false;
            }
        }
        return true;
    }
    public void inorder(TreeNode node,List<Integer>l1){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            l1.add(node.val);}
        inorder(node.left,l1);
        inorder(node.right,l1);
        }
    public void outorder(TreeNode node,List<Integer>l2){
       if(node==null){
           return;
       }
        if(node.left==null && node.right==null){
            l2.add(node.val);}
        outorder(node.left,l2);
        outorder(node.right,l2);
    }

    }
