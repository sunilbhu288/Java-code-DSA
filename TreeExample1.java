import java.util.*;
public class TreeExample1 {
  public static void main(String args[]){
      Node root = create();
  }
  public static Node create(){
    Node root = null;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter value");
     int data = sc.nextInt();
     
     
     if(data == -1){
      return null;
      
     }
     root = new Node(data);

     System.out.println("enter the left value "+ root.data+" ");
     root.left = create();
     root.right = create();
     System.out.println("enter the rigth value "+ root.data+" ");
     return root;
  }
  
}
class Node{
  int data;
  Node left;
  Node right;

  public Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
