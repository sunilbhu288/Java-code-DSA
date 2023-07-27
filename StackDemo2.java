//find previous smallest number
import java.util.*;
public class StackDemo2 {
  public static void main(String []args){
    
    int arr[] = {2,4,3,6,5,7,8,6};
    int arr1 [] = new int[arr.length];
    Stack<Integer>st = new Stack<>();
    for(int i=0;i<arr.length;i++){
      while(!st.isEmpty() && st.peek()>=arr[i]){
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
      System.out.print(arr1[i]+" ");
    }
  }
}
