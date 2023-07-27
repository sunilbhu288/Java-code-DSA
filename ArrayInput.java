import java.lang.*;
import java.util.Scanner;
public class ArrayInput {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    boolean equalValue = false;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==k || Math.abs(arr[i]-arr[j])==k){
          System.out.println("YES");
          equalValue = true;
        }
      }
    }
    if(!equalValue){
      System.out.println("NO");
    }
  }
}