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
        root.getLeft().setLeft(obj.insert(8));
        root.getLeft().setRight(obj.insert(9));
        obj.inorderDisplay(root);
    }
    public void inorderDisplay(Node n){
      if(n==null){
          return;
      }
      inorderDisplay(n.getLeft());
        System.out.println(n.getData());
        inorderDisplay(n.getRight());
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
