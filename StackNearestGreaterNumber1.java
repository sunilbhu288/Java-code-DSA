import java.util.*;
public class StackNearestGreaterNumber1 {
  public static void main(String []args){
    int arr[] = {4,5,2,25};
    nextGreatterNumber(arr);

  }
  public static void nextGreatterNumber(int arr[]){
    Stack<Integer>st = new Stack<>();
    int arr1[] = new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
      while(!st.isEmpty() && st.peek()<=arr[i]){
        st.pop();
      }
      if(st.isEmpty()){
        arr1[i] = -1;
      }
      else{
        arr1[i] = st.peek();
      }
      st.push(arr[i]);
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" "+arr1[i]);
    }
  }
}
