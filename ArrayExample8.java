import java.util.Scanner;
public class ArrayExample8 {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
         arr[i][j]=sc.nextInt();
        }
    }
    int i,j;
    for( i=0;i<arr.length;i++){
        for( j=0;j<arr.length;j++){
         //arr[i][j] = arr[j][i];
        }
        System.out.print(arr[j][i]+" ");
    }
    System.out.println();



}
}
