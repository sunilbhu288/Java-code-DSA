import java.util.*;
public class LinkedList5 {
  Node head;
  int size;
  public static void main(String []args){
  //LinkedList<Integer>list = new LinkedList<>();
  LinkedList5 list = new LinkedList5();
  list.addElement(1);
  list.addElement(2);
  list.addElement(3);
  list.addElement(4);
  list.addElement(5);
  list.addElement(6);
  list.printList();
  list.size();
  list.printList();
  
  }
    class Node{
      int data;
      Node next;
      

      Node(int data){
        this.data = data;
        this.next = null;
      }
    }
    public void addElement(int data){
      Node newNode = new Node(data);
      
      if(head==null){
        head = newNode;
      }
      else{
        newNode.next = head;
        head = newNode;
        size++;
      }   
      }
      public int size(){
        return size;
      }

      public void printList(){
          if(head==null){
            System.out.println("list is empty");
          }
          else{
            Node temp = head;
            while(temp!=null){
              System.out.print(temp.data+" ");
              temp = temp.next;
            }
            System.out.println("null");
          }
      } 
    }

