import java.util.*;
public class StackImplementationUsingQueue {
  public static void main(String []args){
    QueueDemo st = new QueueDemo();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st.top());
    st.pop();
    System.out.println(st.pop());
   // st.pop();
   // System.out.println(st.pop());
    
  }
}
class QueueDemo{
  Queue<Integer>q1 = new LinkedList<Integer>();
  public void push(int x){
    q1.offer(x);
    for(int i=0;i<q1.size()-1;i++){
      q1.offer(q1.peek());
      q1.poll();
    }
  }
  public int pop(){
    return q1.poll();
  }
  public int top(){
    return q1.peek();
  }
}
