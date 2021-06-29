100. Same Tree
Q.....Given the roots of two binary trees p and q, write a function to check if they are the same or not.
      Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    Explanation:-1.create two arraylist and atore the element of BST in it.
                 2.Then use a for loop to compare the value stored in the two linked list.
CODE(Java)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      List<Integer> l1 = new ArrayList<Integer>();
List<Integer> l2 = new ArrayList<Integer>();
helper1(p,l1);
helper2(q,l2);
for(int i=0; i<l1.size();i++){
if(l1.get(i)==l2.ge(i)){
return false;
}
}return true;




public void helper1(TreeNode node1, List<Integer> l1){
if(node1==null){
return;
}
helper1(node1.left,l1);
l1.add(node1.val);
helper1(node1.right,l1);
}
public void helper2(TreeNode node2, List<Integer> l2){
if(node2==null){
return;
}
helper2(node2.left,l2);
l2.add(node2.val);
helper2(node2.right,l2);
}
}
}
-------------------------------------------------------APPROACH 2-----------------------
so here we ook all the condition in more easy to understand way...


Code
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p==null && q==null){
        return true;}
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
         if(!isSameTree(p.left, q.left)){
            return false;
        }

        if(!isSameTree(p.right, q.right)){
            return false;
        }
        return true;

}

}
