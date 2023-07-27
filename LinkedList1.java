import java.util.*;
public class LinkedList1 {
 
  Node head;

   public class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
   }
   public void addfirst(int data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
      }
      else{
        newNode.next = head;
        head = newNode;
      }
   }
   public void addLast(int data){
    Node newNode = new Node(data);
    Node temp = head;
    if(temp == null){
      temp = newNode;
    
    }
    else{
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode;

    }
   }
   public void deletFirst(){
    if(head == null){
      System.out.print("list is empty");
    }
    else{
      head = head.next;
    
    }
   }
   public void displayList(){
      Node temp = head;
      if(temp == null){
        System.out.println("list is empty");
      }
      else{
        while(temp!=null){
          System.out.print(temp.data +" -> ");
          temp = temp.next;
        }
        System.out.println("null");
      }
   }
   public static void main(String []args){
    LinkedList1 list = new LinkedList1();
   
    list.addfirst(5);
   
    list.addfirst(10); 
    list.displayList();
   
     list.addLast(20);
     list.displayList();

     list.deletFirst();
     list.displayList();
  }
  
}
