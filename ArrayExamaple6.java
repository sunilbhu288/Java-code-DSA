import java.util.Scanner;
public class ArrayExamaple6 {
 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[][] = new int [n][n];
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){

             }
         }
         int p=0;
         int k =0;
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
               if((i==j) || (i<j)){
                   p= p+arr[i][j];
               }
             
             if((i==j) || (i>j)){
                 k = k+arr[i][j];
             }
         }
        }
         System.out.println(p+" "+k);

    }
}