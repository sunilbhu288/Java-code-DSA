import java.util.*;
public class LinkedListTest {
  Node head;

  class Node{
    int data;
    Node next;

    Node(int data){
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
    if(head==null){
      System.out.println("list is empty");
      }
      else{
        Node temp = head;
        while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp = temp.next;
      }
      System.out.println("null");
    }
    }
    public void addLast(int data){
      Node newNode = new Node(data);
      if(head == null){
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
    public void deleteFirst(){
      if(head==null){
        System.out.println("list empty");
      }
      else{
        head = head.next;
      }
    }
    public void deleteLast(){
      if(head==null){
        return;
      }
      else{
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null){
          slow = slow.next;
          fast = fast.next;
        }
        slow.next = null ;
      }
    }
    public void reverseList(){
      if(head==null || head.next==null){
       return;
      }
      else{
        Node prev = head;
        Node current = head.next;
        while(current!=null){
          Node nextNode = current.next;
          current.next = prev;
          //updation;
          prev = current;
          current = nextNode;
        }
        head.next = null;
        head = current;
      }
    }
  
  public static void main(String []args){
    LinkedListTest list = new LinkedListTest();
    list.reverseList();
     list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    // list.displayPrint();
    // list.addLast(6);
    // list.displayPrint();
    // list.deleteFirst();
    // list.displayPrint();
    // list.deleteLast();
    // list.displayPrint();
   // list.reverseList();
    list.displayPrint();
    // list.reverseList();
    // list.displayPrint();
  }
}
