import java.util.*;
public class LinkedList3 {
  Node head;
  public static void main(String []args){
    LinkedList3 list = new LinkedList3();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.displayPrint();

  }
  class Node{
    int data;
    Node next;
     public Node(int data){
      this.data = data;
      this.next = null;
    
     }
  }
  public void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
    }
    else{
    newNode.next = head;
    head = newNode;
    }
  }
   public void displayPrint(){
    Node temp = head;
    while(temp!= null){
      System.out.println("list is empty");
    }
    else{
     
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.println("null");
   }
}
