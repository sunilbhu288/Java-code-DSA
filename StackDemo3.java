import java.util.*;
public class StackDemo3 {
   public static void main(String args[]){
    int arr[] = {10,20,30,40,50,60};
    int k = 42;
    solution(arr, k);
   }
   public static void solution(int arr[], int k){
       Stack<Integer>st = new Stack<>();
       for(int i=0;i<arr.length;i++){

      //   while(!st.isEmpty()){
      //   if(arr[i] < k){
      //      st.pop();
      //   }
      //    else if(arr[i]==k){
      //       System.out.println(i);
      //    }
      //    else{
      //       System.out.print(i-1);
      //        System.exit(0);
      //    }
      //   }
      //    st.push(arr[i]);
         while(!st.isEmpty() && k > arr[i]){
            st.pop();
         }
         // st.push(arr[i]);
         // System.out.print(st.peek());
        
       }
       
       
   }
}
