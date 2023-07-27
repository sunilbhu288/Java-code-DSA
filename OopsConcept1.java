public class OopsConcept1 {
  Node head;
 public static void main(String args[]){
  OopsConcept1 list = new OopsConcept1();
  list.addFirst(1);
  list.addFirst(2);
  list.addFirst(3);
  list.addFirst(4);
  list.display();
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
class Node{
  int data;
  Node next;
   Node(int data){
    this.data = data;
    this.next = null;
   }
 }
