package binaryTree;

public class BinarySearchTree {

    public Node root;

    public Node addInorder(Node current, int value){
        if(root==null)
            return new Node(value);

        if(value<current.value)
           current.left =  addInorder(current.left, value);
        if(value>current.value)
           current.right = addInorder(current.right, value);
        else
            return current;

        return current;
    }

    public void add(int val){
        root = addInorder(root, val);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

}
