import java.util.Scanner;
public class Test39 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int ans =  largeSubArray(arr,n);
    System.out.println(ans);
  }
  public static int largeSubArray(int arr[], int n){
    int max_sum = 0;
    int current_sum = 0;
    for(int i=0;i<n;i++){
      current_sum = current_sum +arr[i];
      if(current_sum > max_sum){
        max_sum = current_sum ;
      }
      if(current_sum < 0){
        current_sum = 0;
      }
    }
    return max_sum;
  }
}
