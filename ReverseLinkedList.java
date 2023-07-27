public class ReverseLinkedList {
  Node head;
  public static void main(String []args){
    ReverseLinkedList list = new ReverseLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.printList();
    list.midElement(10);
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
   public void add(int data){
     Node newNode = new Node(data);
     if(head==null){
      head = newNode;
     }
     else{
      newNode.next = head;
      head = newNode;
     }
   }
   public void printList(){
    if(head == null){
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
   public void midElement(int data){
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
