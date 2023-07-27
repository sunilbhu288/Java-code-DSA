import java.util.*;
public class TreeImplementationGeneric {
  //Node root =null;
  class Node{
    int data;
    ArrayList<Node>children;

    Node(int data){
      this.data = data;
      children = new ArrayList<>();
    }
  }
  public static void main(String args[]){
    Node<Integer>root = new Node(2);
  }
  
}
