import java.util.*;
public class StackDeleyteMiddle {
  public static void main(String []args){
   Stack<Character>st = new Stack<Character>();
   st.push('1');
   st.push('2');
   st.push('3');
   st.push('4');
   st.push('5');
   deleteMid(st,st.size(),0);
   while(!st.isEmpty()){
    char ans = st.pop();
    System.out.print(ans+" ");
   }

  }

  static void deleteMid(Stack<Character>st, int n, int curr){
      if(st.isEmpty() || curr==n){
        return;
      }
      char x = st.pop();
      deleteMid(st,n,curr+1);
      if(curr!=n/2){
        st.push(x);
      }
  }
}
