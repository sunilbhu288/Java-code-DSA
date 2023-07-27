import java.util.*;
public class OnlyDemOq {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(findNextValue(arr,n,k));
  }
  public static int findNextValue(int arr[], int n, int k){
     for(int i=0;i<n;i++){
      if(arr[i]>=k){
        System.out.println(arr[i]);
        System.exit(-1);
      }
     }
     return -1;
  }
}
