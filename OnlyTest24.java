import java.util.Scanner;
public class OnlyTest24 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
      int smalest = i;
      for(int j=i+1;j<n;j++){
        if(arr[smalest]>arr[j]){
          smalest = j;
        }
      }
      int temp = arr[smalest];
      arr[smalest] = arr[i];
      arr[i] = temp;
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
