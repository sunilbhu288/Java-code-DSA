import java.util.*;
public class PairOfSortinArrays {
  public static void main(String[]args){
    int arr[] = {1,2,3,4,5,9,6,7,8};
    int k = 8;
    int i=0;
    int j=arr.length-1;
    int count=0;
    Arrays.sort(arr);
    while(i<j){
      if(arr[i]+arr[j]==k){
        count++;
        i++;
        j--;
        
      }
      else if(arr[i]+arr[j]>k){
        j--;
      }
      else
      i++;
    }
    System.out.println(count);
    
  }
}
