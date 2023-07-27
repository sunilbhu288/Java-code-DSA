import java.util.*;
public class Stack1 {
  public static void main(String []args){
    Stack<Integer>st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    System.out.println(st.size());
    st.pop();
    System.out.println(st);
    System.out.println(st.peek());
  }
}
