public class Constructor4 {
  Node head;
  public static void main(String arg[]){
    Constructor4 t1 = new Constructor4();

     t1.reverseLinkedList();
     t1.addFirst(1);
     t1.addFirst(2);
     t1.addFirst(3);
     t1.addFirst(4);
     t1.addFirst(5);
     
     t1.display();
    //  t1.deleteMid();
    //  t1.display();

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
  public void display(){
    if(head==null){
      System.out.println("list empty");
    }
    else{
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp = temp.next;
      }
      System.out.println("null");
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
    int size =  countSize(head);
    int mid = size/2;
    Node temp = head;
    while(mid>1){
      
      temp = temp.next;
      mid--;
    }
    temp.next = temp.next.next;
  }
  public void reverseLinkedList(){
    Node prev = head;
    Node curr = head.next;
    while(curr!=null){
      Node nextNode = curr.next;
      curr.next = prev;
      //update
      prev = curr;
      curr = nextNode;
    }
    head.next = null;
    head = curr;
  }

}
