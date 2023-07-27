public class LinkedList6 {
  Node head;
  public static void main(String []args){
    LinkedList6 list = new LinkedList6();
    list.reverseList();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.printList();
    
    
  }
  class Node{
    Node next;
    int data;

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
  public void reverseList(){
    if(head==null || head.next==null){
       return;
    }
     Node prev = head;
     Node curr = head.next;
     while(curr!=null){
      Node nextNode = curr.next;
      curr.next =prev;
      //update
      prev = curr;
      curr = nextNode;
     }
    
     head.next = null;
     head = curr;
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
