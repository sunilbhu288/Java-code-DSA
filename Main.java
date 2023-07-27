import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int arr[] = new int [size];
          for(int i=0;i<size;i++){
               arr[i] = sc.nextInt();

          }
          int d=0;
          for(int i=0;i<size;i++){
               for(int j=0;j<size;j++){
          if(arr[j] == arr[i]){
                d = arr[j];
          }
     }
     System.out.println(d+" ");

          }
          

     }
}
