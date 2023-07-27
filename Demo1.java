
public class Demo1 {
  Node head;

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
    if(head == null){
      head = newNode;
      return;
    }
    else{
      newNode.next = head;
      head = newNode;
    }
  }
  public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode;
      newNode.next = null;
    }
  }
   public void deleteFirst(){
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      head = head.next;
    }
   } public void deleteLast(){
    if(head == null){
      System.out.println("list is empty");
    }
    else{
      Node slow = head;
      Node fast = head.next;
      while(fast.next!= null){
        slow = slow.next;
         fast =fast.next;
      }
      //slow.next = slow.next.next;
      slow.next = null;
    }
   }
   public void reverseList(){
    if(head == null){
      System.out.println("list is empty");
    }
    else if(head.next == null){
        System.out.println(head);
        return;
    }
    else{
      Node prev = head;
      Node current = head.next;
      while(current!=null){
         current.next = prev;
        prev = current.next;
        current = 
      }
    }
   }
  public void print(){
    if(head == null){
      System.out.print("list is empty");
      return;
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
  public static void main(String []args){
    Demo1 list = new Demo1();
     list.addFirst(1);
     list.addFirst(2);
     list.addFirst(3);
     list.addFirst(4);
     list.addFirst(5);
     list.print();
     list.addLast(6);
     list.print();
     list.deleteFirst();
     list.print();
     list.deleteLast();
     list.print();


  }
  
}
