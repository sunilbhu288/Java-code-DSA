public class LinkeListDemo {
  Node head;
  public static void main(String []args){

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
  public void deleteMid(){
    
  }
}
