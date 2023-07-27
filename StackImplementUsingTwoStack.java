import java.util.*;
public class StackImplementUsingTwoStack {
  public static void main(String []args){
    QueueDemo st = new QueueDemo();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st.top());
    st.pop();
    System.out.println(st.top());
    st.pop();
    System.out.println(st.top());
    st.pop();
    System.out.println(st.top());
    //st.pop();
  }
}
class QueueDemo{
  Queue<Integer>q1 = new LinkedList<Integer>();
  Queue<Integer>q2 = new LinkedList<Integer>();
  public void push(int x){
    q2.add(x);
    while(!q1.isEmpty()){
      q2.add(q1.peek());
      q1.remove();
    }
    Queue<Integer>q = q1;
    q1 = q2;
    q2 = q;
  }
  public void pop(){
    if(q1.isEmpty()){
      System.out.println("queue is empty");
      return;
     // System.exit(0);
    }
    q1.remove();
  }
  public int top(){
    if(q1.isEmpty()){
      return -1;
    }
    return q1.peek();
  }

}
