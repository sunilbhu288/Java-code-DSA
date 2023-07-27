import java.util.*;
public class QueueDemo2 {
  public static void main(String []args){
    Demo qq = new Demo();
    qq.addElement(1);
    qq.addElement(2);
    qq.addElement(3);
    qq.addElement(4);
    System.out.println(qq.top());
    qq.pop();
    System.out.println(qq.top());
    qq.pop();
    System.out.println(qq.top());
    qq.pop();
    System.out.println(qq.top());
  }
}
class Demo{
  Queue<Integer>q1 = new LinkedList<Integer>();
  Queue<Integer>q2 = new LinkedList<Integer>();
  public void addElement(int x){
    q2.add(x);
    while(!q1.isEmpty()){
      q2.add(q1.peek());
      q1.poll();
    }
      Queue<Integer>q = q1;
      q1 = q2;
      q2 = q;
    

  }
  public int pop(){
    return q1.poll();
  }
  public int top(){
    return q1.peek();
  }
}
  

