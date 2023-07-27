import java.util.*;
public class QueueImplementationUsingTwoStack {
  public static void main(String []args){
    QueueDemo q = new QueueDemo();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
  
  }

}
class QueueDemo{
  Stack<Integer>s1 = new Stack<Integer>();
  Stack<Integer>s2 = new Stack<Integer>();
  public void enqueue(int x){
    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }
    s1.push(x);
  
  while(!s2.isEmpty()){
    s1.push(s2.pop());
  }
  }
  public int deque(){
    int x = s1.peek();
    s1.pop();
    return x;
  }
 
}
