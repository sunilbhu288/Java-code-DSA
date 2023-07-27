import java.util.Scanner;
public class ArraysTest1 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    System.out.println();
    System.out.println("Result");
    for(int i=0;i<n;i++){
      for(int j =0;j<n;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  
}
