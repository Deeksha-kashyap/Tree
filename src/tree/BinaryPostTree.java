package tree;

public class BinaryPostTree {
   public Node insert(int data){
    Node n=new Node();
    n.setData(data);
    return n;
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
