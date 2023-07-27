import java.util.Scanner;
public class ArraysRotate90 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
      }
      // transpose the matrix........
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
          int temp = arr[i][j];
          arr[i][j] = arr[j][i];
          arr[j][i]= temp;
        }
      }
       for(int i=0;i<n;i++){
        int l =0;
        int h = arr.length-1;
        while(l<h){
          int temp = arr[i][l];
          arr[i][l]= arr[i][h];
          arr[i][h]= temp;
          l++;
          h--; 
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
  }

