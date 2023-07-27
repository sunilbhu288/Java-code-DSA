import java.util.Scanner;
public class OnlyTest40 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
    int n = sc.nextInt();

    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int ans[] = findSortedArrays(arr);
    for(int i=0;i<n;i++){
      System.out.print(ans[i]+" ");
    }
    t--;
  }
  }
  public static int [] findSortedArrays(int arr[]){
    int ans[] = new int[arr.length];
    int i=0;
    int j=arr.length-1;
    int k = arr.length-1;
    while(i<=j){
      if(arr[i]*arr[i]>arr[j]*arr[j]){
        arr[k] = arr[i]*arr[i];
        i++;

      }
      else{
        arr[k] = arr[j]*arr[j];
        j--;
      }
      k--;
    }
    return ans;
  }
  
}
