import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            Arrays.sort(arr);
        
        System.out.print(arr[i]+" ");
        }
    }
}
