import java.util.*;
public class TwoPointer {
  public static void main(String []args){
    int arr[] = {2,4,3,5,3,6,4};
    int j=0;
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]!=arr[i+1]){
        arr[j]=arr[i];
        j++;
      }
      
    }
    arr[j] = arr[arr.length-1];
    j++;
    for(int k=0;k<j;k++){
      System.out.print(arr[k]+" ");
    }
  }
}
