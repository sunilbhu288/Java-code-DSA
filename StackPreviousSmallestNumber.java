import java.util.*;
public class StackPreviousSmallestNumber {
  public static void main(String []args){
    int arr[] = {4,10,5,18,3,12,7};

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
