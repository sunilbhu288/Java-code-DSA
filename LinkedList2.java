import java.util.*;
public class LinkedList2 {
  Node head;
  public static void main(String []args){
    LinkedList2 list = new LinkedList2();
      list.reverseLinkedList();
      list.addFirst("sunil");
      list.addFirst("anil");
      list.addFirst("rahul");
      list.addFirst("vandana");
     // list.displaylist();
     // list.addLast("mohit");
     // list.displaylist();
     // list.deletFirst();
     // list.displaylist();
      //list.deletLast();
      list.displaylist();
     // list.deletMid();
     // list.displaylist();
      
      // list.displaylist();

  }
  class Node{
     String data;
     Node next;

     Node(String data){
      this.data = data;
      this.next = null;
     }
  }
  public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
       head = newNode;  
    }
    else{
      newNode.next= head;
      head = newNode;
    }
  }
  public void addLast(String data){
    Node newNode = new Node(data);
    if(head==null){
       head = newNode;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }
   public void deletFirst(){
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      head = head.next;
    }
   }
   public void deletLast(){
    if(head==null){
      System.out.println("list is empty");
    }
    else{
    Node slow = head;  
    Node fast = head.next;
    while(fast.next!=null){
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = null;
  }
   }
   public void reverseLinkedList(){
    if(head==null || head.next==null){
      return;
    }
      Node prevNode = head;
      Node currentNode = head.next;
      while(currentNode!=null){
        Node nextNode = currentNode.next;
        currentNode.next = prevNode;
        //update
        prevNode = currentNode;
        currentNode = nextNode;
      }
      head.next = null;
      head = currentNode;
    }
   
  /*  public void deletMid(){
    if(head==null || head.next!=null){
      System.out.println("there is no middle list");
    }
    else{
      Node slow = head;
      Node fast = head;
      while(fast!=null || fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }
      slow.next = slow.next.next;
    }
   }*/
  public void displaylist(){
    if(head==null){
      System.out.println("list is empty");
    }
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }
}
