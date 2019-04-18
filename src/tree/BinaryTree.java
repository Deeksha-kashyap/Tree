package tree;

public class BinaryTree {
    public Node insert(int data){
        Node n=new Node();
    }
}
class Node{
    private int data;
    private Node left;
    private Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
