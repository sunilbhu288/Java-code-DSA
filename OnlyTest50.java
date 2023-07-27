import java.util.Arrays;
import java.util.Scanner;
public class OnlyTest50 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    if(isdEqual(arr, n, k)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
    
  }
  
  public static boolean isdEqual(int arr[], int n, int k){
    int i=0;
    int j =arr.length-1;
    if(i<=j){
    while(i<n && j<n){
      if(arr[i]+arr[j]==k){
        return true;
      }
      if(arr[i]+arr[k]>k){
         i++;
      }
      else{
        j++;
      }

      }
    }
      return false;
    }
  }

