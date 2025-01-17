package tree;

public class BinaryPostTree {
   public Node insert(int data){
    Node n=new Node();
    n.setData(data);
    return n;
   }
   public void postOrderDisplay(Node n){
    if(n==null){
        return;
    }
    postOrderDisplay(n.getLeft());
       postOrderDisplay(n.getRight());
       System.out.println(n.getData());
   }
     public void preOrderDisplay(Node n){
      if(n==null){
          return;
      }
         System.out.println(n.getData());
         preOrderDisplay(n.getLeft());
         preOrderDisplay(n.getRight());
     }
    public static void main(String[] args) {
     BinaryPostTree obj=new BinaryPostTree();
     Node root=obj.insert(2);
     root.setLeft(obj.insert(4));
     root.setRight(obj.insert(8));
     root.getLeft().setLeft(obj.insert(6));
     root.getLeft().setRight(obj.insert(5));
        System.out.println("Print Post Order element:");
     obj.postOrderDisplay(root);
        System.out.println("Print Pre Order element:");
     obj.preOrderDisplay(root);
    }
}
  class PostNode{
    private int data;
    private PostNode left;
    private PostNode right;

      public int getData() {
          return data;
      }

      public void setData(int data) {
          this.data = data;
      }

      public PostNode getLeft() {
          return left;
      }

      public void setLeft(PostNode left) {
          this.left = left;
      }

      public PostNode getRight() {
          return right;
      }

      public void setRight(PostNode right) {
          this.right = right;
      }
  }
