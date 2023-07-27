import java.util.Scanner;
public class Demo7 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    rotateArray(arr,k,n);
  }
  public static void rotateArray(int arr[], int k, int n){
    for(int i=k;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    for(int i=0;i<k;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
