public class LinkedListAddElementInMid {
  Node head;
  public static void main(String []args){
    LinkedListAddElementInMid list = new LinkedListAddElementInMid();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list. printList();
    list.addElementInMid(10);
    list. printList();
  }
  class Node{
    Node next;
    int data;

    Node(int data){
      this.data = data;
      this.next = next;
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
  public void addElementInMid(int data){
    Node newNode = new Node(data);
    int size = countSize(head);
    int mid = size/2;
    Node temp = head;
    while(mid>0){
      temp = temp.next;
      mid--;
    }
    newNode.next = temp.next;
    temp.next = newNode;
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
}
