package tree;

public class BinarySearchTree {
  public static Node1 insert(Node1 root, Node1 newNode){
   if(root==null){
     root=newNode;
   }
   if(root.getData()>newNode.getData()){
     if( root.getLeft()==null){
       root.setLeft(newNode);
     }else{
         insert(root.getLeft(),newNode);
     }
   }else if(root.getData()<newNode.getData()){
      if(root.getRight()==null){
        root.setRight(newNode);
      }else{
          insert(root.getRight(),newNode);
      }
   }
   return root;
  }
}
class Node1{
  private int data;
  private Node1 left;
  private Node1 right;

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node1 getLeft() {
    return left;
  }

  public void setLeft(Node1 left) {
    this.left = left;
  }

  public Node1 getRight() {
    return right;
  }

  public void setRight(Node1 right) {
    this.right = right;
  }
}
