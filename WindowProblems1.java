import java.util.*;
public class WindowProblems1 {
public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
  }
   int ans = findMaxSumWindow(arr,n,k);
   System.out.println(ans);
}
  public static int findMaxSumWindow(int arr[], int n, int k){
    int maxSum = 0;
    
    for(int i=0;i<=n-k;i++){
      int sum = 0;
      for(int j=i;j<k+i;j++){
        sum = sum + arr[j];
      }
      if(sum>maxSum){
        maxSum = sum;
      }
    }
    return maxSum;
  }
}
