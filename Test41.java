import java.util.*;
public class Test41 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    nonRepeateArray(arr,n);
  }
  public static void nonRepeateArray(int arr[], int n){
    Arrays.sort(arr);
    int j=0;
    for(int i=0;i<n-1;i++){
      if(arr[i]!=arr[i+1]){
        arr[j] = arr[i];
        j++;
      }
    }
    //1,1,2,3,4,4,
    arr[j] = arr[n-1];
    j++;
    for(int k = 0; k<j;k++){
      System.out.print(arr[k]+" ");
    }
  }
}
