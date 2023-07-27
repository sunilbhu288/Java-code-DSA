import java.util.Scanner;

public class ArrayExample7 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int j = 1;
    int k=0;
    for (int i=0;i<arr.length;i++){
     if(size%2==0){
         k = arr[i]+arr[j];
            j++;
        }
   }
   System.out.println(k);
}
   }