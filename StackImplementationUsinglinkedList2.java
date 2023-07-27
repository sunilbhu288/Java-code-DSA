public class StackImplementationUsinglinkedList2 {
   Node front;
   public static void main(String args[]){
    StackImplementationUsinglinkedList2 st = new StackImplementationUsinglinkedList2();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.display();
   }
   public void push(int data){
    Node newNode = new Node(data);
    //Node temp = new Node();
    if(newNode==null){
      System.out.println("OverFlow");
      return;
    }
     front.next = newNode;
      front = newNode;
   }
   public void pop(){
    if(front ==null){
      System.out.println("underflow");
      return;
    }
     front = front.next;
   }
  public void display(){
    if(front==null){
      System.out.println("stack is empty");
    }
    Node temp = front;
    System.out.print(temp.data+" ");
    temp = temp.next;
  }
  //System.out.println("null");

}
class Node{
  Node next;
  int data;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}