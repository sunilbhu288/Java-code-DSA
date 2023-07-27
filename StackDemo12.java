import java.util.*;
public class StackDemo12 {
  public static void main(String args []){
    StackDemo st = new StackDemo();
    
    st.addElement(1);
    st.addElement(2);
    st.addElement(3);
    st.addElement(4);
    System.out.println(st.top());
    st.poll();
    System.out.println(st.top());
    st.poll();
    System.out.println(st.top());
    st.poll();
    System.out.println(st.top());
   // st.poll();
  }
}
class StackDemo{
  Stack<Integer>s1 = new Stack<Integer>();
  Stack<Integer>s2 = new Stack<Integer>();
  public void addElement(int x){
   while(!s1.isEmpty()){
     s2.push(s1.pop());
   }
   s1.push(x);
   while(!s2.isEmpty()){
    s1.push(s2.pop());
   }
  }
  public int poll(){
    if(s1.isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }
    return s1.pop();
  }
  public int top(){
    return s1.peek();
  }
}