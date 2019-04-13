package tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left,right;

    public BinaryTreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    public void Inorder(BinaryTreeNode root){
        if(root!=null){
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
        }
    }
    public ArrayList<Integer>inorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res=new ArrayList<Integer>();
        Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
        BinaryTreeNode currentNode=root;
        boolean done=false;
        while(!done){
            if(currentNode!=null){
                final BinaryTreeNode push = (BinaryTreeNode) s.push(currentNode);
                currentNode=currentNode.left;
            }else if(s.isEmpty()){
                    done=true;
            }else{
                currentNode=s.pop();
                res.add(currentNode.data);
                currentNode=currentNode.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
