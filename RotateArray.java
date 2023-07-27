import java.util.*;
public class RotateArray {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    rotateElement(arr,k,n);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void reverseArray(int arr[], int i, int j){
    int l = i;
    int h = j;
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
  public static void rotateElement(int arr[], int k,int n){
    reverseArray(arr,0,n-k+1);

    reverseArray(arr,k+1,n-1);
     
    reverseArray(arr,0,n-1);
  }
}
