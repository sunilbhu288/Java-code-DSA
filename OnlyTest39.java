import java.util.Arrays;
import java.util.Scanner;
public class OnlyTest39 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int ans[] = squarArrays(arr, n);
    for(int i=0;i<n;i++){
      System.out.print(ans[i]+" ");
    }
    t--;
    }
  }
  public static int [] squarArrays(int arr[], int n){
    for(int i=0;i<n;i++){
      arr[i]*=arr[i];
      Arrays.sort(arr);
      
    }
    return arr;
  }
}
