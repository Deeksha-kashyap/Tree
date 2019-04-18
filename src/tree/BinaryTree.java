package tree;

public class BinaryTree {
    public Node insert(int data){
        Node n=new Node();
        n.setData(data);
        return n;
    }

    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        Node root=obj.insert(2);
        root.setLeft(obj.insert(3));
        root.setRight(obj.insert(5));
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
