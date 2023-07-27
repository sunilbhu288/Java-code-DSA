public class MockInterviewDSA2Easy {
  Node head;
  public static void main(String [] args){
    MockInterviewDSA2Easy list = new MockInterviewDSA2Easy();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.printList();
    list.deleteMid();
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
    if(head == null){
       head = newNode;
    }
    else{
      newNode.next = head;
      head = newNode;
    }
  }
  public int countSize(Node head){
    int count = 0;
    if(head ==null){
      return -1;
    }
    while(head!=null){
      head = head.next;
      count++;
    }
    return count;
  }
  public void deleteMid(){
    if(head==null && head.next==null){
      return;
    }
    int size = countSize(head);
    int mid = size/2;
    Node temp = head;
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
}
