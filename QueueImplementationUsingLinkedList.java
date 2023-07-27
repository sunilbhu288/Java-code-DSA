public class QueueImplementationUsingLinkedList {

  Node front;
  Node rear;
  public static void main(String []args){
    QueueImplementationUsingLinkedList qq = new QueueImplementationUsingLinkedList();
    qq.enque(1);
    qq.enque(2);
    qq.enque(3);
    qq.enque(4);
    qq.enque(5);
    qq.display();
    qq.deque();
    qq.deque();
    qq.deque();
    qq.deque();
    qq.deque();
    qq.deque();
    qq.display();

  }
  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public void enque(int data){
    Node newNode = new Node(data);
    if(front==null){
      front = rear = newNode;
    }
    else{
       rear.next = newNode;
       rear = newNode;;
    }
  }
  public void display(){
    
      Node temp = front;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
     System.out.println();
    }
  
  public void deque(){
    if(front == null){
      System.out.println("underflow");
    }
    else{
      front = front.next;
    }
  }
}
