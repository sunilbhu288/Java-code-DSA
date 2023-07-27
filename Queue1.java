public class Queue1 {
  Node front;
  Node rear;
  public static void main(String []args){
    Queue1 list = new Queue1();
    list.enqueOperation(1);
    list.enqueOperation(2);
    list.enqueOperation(3);
    list.enqueOperation(4);
    list.enqueOperation(5);
    list.printList();

  }
  class Node{
    int data;
    Node next;

    Node(int data){
      this.data=data;
      this.next = null;
    }
  }
  public void enqueOperation(int data){
    Node newNode = new Node(data);
    if(front==null){
      front = rear = newNode;
      return;
    }
    else{
      rear.next = newNode;
      rear = newNode;
      System.out.print(rear+" ");
    }
  }
  public void dequeOperation(){
    if(rear==null){
      System.out.println("list is empty");
    }
    else{
      front = front.next;
    }
  }

  public void printList(){
    if(rear==null){
      System.out.println("list is empty");
      Node temp = front;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
    }
  }
}
