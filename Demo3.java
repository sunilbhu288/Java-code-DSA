import java.util.Scanner;
public class Demo3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int p = k-1;p>=0;p--){
      System.out.print(arr[p]+" ");
    }
    for(int j = k;j<n;j++){
      System.out.print(arr[j]+" ");
    }
  }
}
