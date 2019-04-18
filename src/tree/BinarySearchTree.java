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

  public static boolean search(Node1 root, int data){
    boolean r=false;
    if(root.getData()==data){
        return true;
    }else if(root.getData()>data){
        if(root.getLeft()==null) {
            System.out.println("left is empty");
        }else{
            r=search(root.getLeft(),data);
        }
    }else if(root.getData()<data){
      if(root.getRight()==null){
          System.out.println("right is empty");
      }else{
          r=search(root.getRight(),data);
      }
    }else if(root==null){
        System.out.println("empty");
    }
    return r;
  }

   public void inorder(Node1 n){
     if(n==null){
         return;
     }
     inorder(n.getLeft());
       System.out.println(n.getData());
       inorder(n.getRight());
   }

   public void postOrder(Node1 n){
    if(n==null){
        return;
    }
    postOrder(n.getLeft());
    postOrder(n.getRight());
       System.out.println(n.getData());
   }

   public void preOrder(Node1 n){
     if(n==null){
         return;
     }
       System.out.println(n.getData());
   }

    public static void main(String[] args) {

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
