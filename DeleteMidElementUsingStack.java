import java.util.*;
public class DeleteMidElementUsingStack {
  public static void main(String []args){
    StackDemo s = new StackDemo();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    while(!s.isEmpty()){
      System.out.print(s+" ");
    }
  }
}
class StackDemo{
  Stack<Integer>st1 = new Stack<Integer>();
  Stack<Integer>st2 = new Stack<Integer>();
  public void push(int x){
    if(st1.isEmpty()){
      System.out.println("stack is empty");
      return;
    }
    st1.push(x);
  }
  public void deleteMid(){
    if(st1.isEmpty()){
      System.out.println("stack is empty");
      return;
    }
    int size = st1.size();
    int mid = size/2;
    while(mid>1){
      st2.push(st1.peek());
      st1.pop();
      mid--;
    }
    st1.pop();
    while(!st2.isEmpty()){
      st1.push(st2.peek());
      st2.pop();
    }
  }
}
