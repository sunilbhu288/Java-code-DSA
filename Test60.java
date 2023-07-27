import java.util.*;
public class Test60 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    orderOfZero(arr,n);
  }
  public static void orderOfZero(int arr[], int n){
    int count =0;
    for(int i=0;i<n;i++){
      if(arr[i]>0){
        count++;
      System.out.print(arr[i]+" ");
      }
    }
    for(int i=0;i<n-count;i++){
     System.out.print("0"+" ");
    }
  }
}
