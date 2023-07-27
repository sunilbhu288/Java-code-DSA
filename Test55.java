import java.util.*;
public class Test55 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    findTargetIndex(arr,n,k);
  }
  public static void findTargetIndex(int arr[], int n, int k){
    boolean flag = false;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==k){
          System.out.print(i+" "+j);
          flag = true;
          break;
        }
        
      }
    }
    if(flag==false){
      System.out.print("Index is not found");
    }

    
  }
}
