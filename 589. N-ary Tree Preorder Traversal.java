Q....Given the root of an n-ary tree, return the preorder traversal of its nodes values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

Sol:- So first create a linked list which store the preorder.
N treenow create a new function which will iterate through all he children and store them in preorder.

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
     List<Integer> l;
    public List<Integer> preorder(Node root) {
     l =new ArrayList<Integer>();
        ppreorder(root);
        return l;
    }
    public void ppreorder(Node node ){
        if(node==null){
            return;
        }
        l.add(node.val);
        for(Node child:node.children){
            ppreorder(child);
        }

        }



}




/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
     List<Integer> l;
    public List<Integer> preorder(Node root) {
     l =new ArrayList<Integer>();
        ppreorder(root);
        return l;
    }
    public void ppreorder(Node node ){
        if(node==null){
            return;
        }
        l.add(node.val);
        for(Node child:node.children){
            ppreorder(child);
        }

        }



}
