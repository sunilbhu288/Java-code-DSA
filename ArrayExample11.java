import java.util.Scanner;
public class ArrayExample11 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int [n][m];
        for(int x = 0;x<arr.length;x++){
             for(int y=0;y<arr.length;y++){
                   arr[x][y] =sc.nextInt(); 
                }
                printNumber(arr);
            }
        }
        } 
        public static void printNumber(int [][]arr){
            for(int x = 0;x<arr.length;x++){
             for(int y=0;y<arr.length;y++){

             if(arr[x][y]>0){
            System.out.println("1"+" ");
        }
        // System.out.println();
        //   else if(arr[x][y]){
            else{
              System.out.println("0"+" ");
          }
          System.out.println();
         }
        }            
    }
}
   
