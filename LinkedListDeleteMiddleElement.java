public class LinkedListDeleteMiddleElement {
  Node head;
  public static void main(String []args){
    LinkedListDeleteMiddleElement list = new LinkedListDeleteMiddleElement();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
   // list.addFirst(6);
   // list.printList();
    //list.addMid(10);
    list.printList();
    list.deletMid();
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
   public int countSize(Node head){
    int count = 0;
    while(head!=null){
      head = head.next;
      count++;
    }
    return count;
   }
   public void deletMid(){
    if(head==null || head.next==null){
      return;
    }
    Node temp = head;
    int size = countSize(head);
    int mid = size/2;
    while(mid>1){
      temp = temp.next;
      mid--;
    }
    temp.next = temp.next.next;


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
   public void addMid(int data){
    Node newNode = new Node(data);
     Node slow = head;
     Node fast = head.next;
     while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
     }
     newNode.next = slow.next;
     slow.next = newNode;
   }
  
}
