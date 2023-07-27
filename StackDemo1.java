import java.util.*;
public class StackDemo1 {
  public static void main(String []args){
    int arr[] = {3,2,5,4,7,6,8,9,};
    int n = arr.length;
    Stack<Integer>s = new Stack<>();
    int arr1[] = new int[n];
    for(int i=n-1;i>=0;i--){
      while(!s.isEmpty() && s.peek()<=arr[i]){
        s.pop();
      }
      if(s.isEmpty()){
        arr1[i] = -1;
      }
      else{
        arr1[i] = s.peek();
      }
      s.push(arr[i]);
    }
    for(int i=0;i<n;i++){
      System.out.println(arr[i]+"-->"+arr1[i]);
    }
  }
}
