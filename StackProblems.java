import java.util.*;
public class StackProblems {
  public static void main(String []args){
    int arr[] = {2,4,3,6,5,4,7,8,9};
    Stack<Integer>st = new Stack<>();
    for(int i=0;i<arr.length;i++){
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
