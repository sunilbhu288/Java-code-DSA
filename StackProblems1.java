import java.util.Queue;
import java.util.*;
public class StackProblems1 {
  public static void main(String args[]){
    //Scanner sc = new Scanner(System.in);
    int arr[] = {2,3,1,5,4,6,7};
    printNumber(arr);
    System.out.println();
    printNumberInQueue(arr);
  }
  public static void printNumber(int arr[]){
  Stack<Integer>st1 = new Stack<>();
    for(int i=0;i<arr.length;i++){
      st1.push(arr[i]);
      System.out.print(st1+" ");
    }
  }
  public static void printNumberInQueue(int arr[]){
    Queue<Integer>q1 = new PriorityQueue<>();
    for(int i=0;i<arr.length;i++){
      q1.add(arr[i]);
      System.out.print(q1+" ");
    }

  }
}
