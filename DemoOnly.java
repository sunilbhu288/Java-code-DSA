public class DemoOnly {
  Node front;
  public static void main(String []args){
    DemoOnly st = new DemoOnly();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.printlist();

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
    if(front==null ){
      System.out.println("underflow");
    }
    else{
      front = front.next;
    }
  }
  public void printlist(){
    
      Node temp = front;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      System.out.println();
    }
  
  public void peek(){
    System.out.println(front.data);
  }
}
