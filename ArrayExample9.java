// assending and desending order program;if we use assending order arrays the we shoud 
//use assending order arrays in loop 
import java.util.Scanner;
import java.util.Arrays;
public class ArrayExample9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
