import java.util.*;
public class NewtonAssyment1 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n;i++){
      arr[i] = sc.nextInt();
    }
    if(isSolution(arr,n,k)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
  
  public static boolean isSolution(int arr[], int n, int k){
    for(int i=0;i<n-1;i++){
       for(int j =i+1;j<n;j++){
        if(arr[i]+arr[j]==k || arr[i]-arr[j]==k){
          return true;
        }
       }
    }
    return false;
  }
}
