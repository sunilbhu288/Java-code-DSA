import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample10 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    int len;
    for(int i=0;i<t;i++){
         len = sc.nextInt();
        int arr[] = new int[len];
      for(int j=0;j<len;j++){
        arr[j] = sc.nextInt();
      }
        printNumber(arr);
      
      }
    }
      //Arrays.sort(arr);

      public static void printNumber(int []arr){
        int len=0;
        Arrays.sort(arr);
      for(int j=arr.length-1;j>=0;j--){
        System.out.print(arr[arr.length-1]+" ");
        System.out.print(arr[arr.length-2]+" ");
        System.out.print(arr[arr.length-len]+" ");
        break;
      }
    System.out.println();
    

   }
}
