import java.util.Scanner;
import java.util.Arrays;
public class NewtonProblems {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    while(testcase>0){
      int n = sc.nextInt();
      
      long arr[] = new long [n];
      for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
      }
      int k = sc.nextInt(); 
      System.out.println(isPresent(arr,n,k));

     testcase--;
    }
  }
  
  static int isPresent(long arr[], int n, long k){
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
      if(arr[i]==k){
        return 1;
      }
    }
    return 0;
  }
}
