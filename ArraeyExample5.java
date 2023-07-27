import java.util.Scanner;

public class ArraeyExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloum = sc.nextInt();
        int arr[][] = new int[row][coloum];
        int i,j;
        for ( i = 0; i < arr.length; i++) {
        for( j=0;j<arr.length;j++){
            arr[i][j] = sc.nextInt();
        }
        for( i=0;i<arr.length;i++){
            for( j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
}
