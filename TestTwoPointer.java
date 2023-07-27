
import java.util.*;
public class TestTwoPointer {
  public static void main(String []args){
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    printIndex(arr,k);
  }
  
  public static void printIndex(int arr[], int k){
    Arrays.sort(arr);
     int i =0;
     int j = arr.length-1;
     while(i<j){
      if(arr[i]+arr[j]==k){
        System.out.print(i + " "+ j);
         break;
      }
      else if(arr[i]+arr[j]>k){
        j--;
      }
      else if(arr[i]+arr[j]<k){
        i++;
      }
      }
     }
  
  }

