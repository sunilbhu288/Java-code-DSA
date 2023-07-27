import java.util.Scanner;
public class Test30 {
  public static void main(String []args){
    int arr[]= {2,6,9,12,15,21};
    int k = 31;
    if(isEqual(arr,k)){
    System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
  public static boolean isEqual(int arr[], int k){
    int i =0;
    int j = arr.length-1;
    while(i<j){
    if(arr[i]+arr[j]==k){
      return true;
    
    }
    if(arr[i]+arr[j]>k){
      j--;
    }
    else {
      i++;
    }
  }
  return false;
  }
}
