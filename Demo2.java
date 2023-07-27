import java.util.*;
public class Demo2 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    printNearestMaxElement(arr,n);
  }
  public static void printNearestMaxElement(int arr[], int n){
    for(int i=0;i<n-1;i++){
      for(int j =i+1;j<n;j++){
        if(arr[j]>arr[i]){
          System.out.println(arr[i]+" ");
          break;
        }
      }
    }
    arr[n-1] = -1;
    System.out.print(arr[n-1]);
  }
}
