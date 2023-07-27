import java.util.*;
public class Test25 {
  public static void main(String []args){
    int arr[] = {2,4,3,8,6,5,7};
    Arrays.sort(arr);
    int j =0;
    int n = arr.length;
    for(int i=0;i<n-1;i++){
      if(arr[i]!=arr[i+1]){
        arr[j]=arr[i];
        j++;
      }
    }
  //  arr[j]=arr[n-1];
    System.out.print(arr[j]+" ");
  }
}
