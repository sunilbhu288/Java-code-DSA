import java.util.*;
public class Tree_Creation {
  public static void main(String []args){
    //Tree_Creation t1 = new Tree_Creation();
      Node root = creat();

  }
   static Node creat(){
  int data;
  Scanner sc = new Scanner(System.in);
  Node root = null;
  System.out.print("enter value");
  data = sc.nextInt();
  if(data == -1){
    return null;
  }
  root = new Node(data);
  System.out.print("enter left child of "+ root.data+" ");
  root.left = creat();
  System.out.print("enter right child of "+root.data+" ");
  root.right = creat();
  return root;
 }
}
class Node{
  Node left;
  Node right;
  int data;

  public Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}