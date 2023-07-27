public class StackImplementationUsingLinkedList {
  Node front;
  public static void main(String []args){
    StackImplementationUsingLinkedList st = new StackImplementationUsingLinkedList();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.display();
  }
  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public void push(int data){
    Node newNode = new Node(data);
    if(front==null){
      front = newNode;
    }
    else{
      newNode.next = front;
      front = newNode;
    }
  } 
  public void pop(){
    if(front==null){
      System.out.print("underflow");
    }
    else{
      front = front.next;
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
  public void peek(){
    if(front == null){
      System.out.println("no any element");
    }
    else{
      System.out.println(front.data);
    }
  }
}
