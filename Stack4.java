import java.util.*;
public class Stack4 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    //char ch []= str.toCharArray();
    result(str);

  }
  public static void result(String str){
    String ans = "";
    Stack<Character>st = new Stack<>();
    for(int i=0;i<str.length();i++){
      while(!st.isEmpty() && st.peek()==str.charAt(i)){
        st.pop();
      }
      if(st.isEmpty()){
        ans = ans + str.charAt(i);
      }
       else if(st.peek()!=str.charAt(i)){
        ans = ans + str.charAt(i);
       }
       else{
        st.push(str.charAt(i));
       }
    }
     System.out.println(ans);
  }
}
