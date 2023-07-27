import java.util.*;
public class StackNearestGreaterNumber {
  public static void main(String []args){
    int arr[] = {2,4,3,6,5,4,7,8,5};
    Stack<Integer>st = new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
      while(!st.isEmpty() && st.peek()>arr[i]){
        st.pop();
      }
      if(st.isEmpty()){
        System.out.print("-1"+" ");
      }
      else{
        System.out.print(st.peek()+" ");
      }
      st.push(arr[i]);
    }
  }
}
