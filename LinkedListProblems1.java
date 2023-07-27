public class LinkedListProblems1 {
  Node head;
  public static void main(String args[]){
    LinkedListProblems1 ll = new LinkedListProblems1();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.display();
  }
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
       return;
    }
    //Node temp = head;
    newNode.next = head;
    head = newNode;
  }
  public void display(){
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
