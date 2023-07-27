import java.util.Scanner;
public class MaxArray1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int max;
        
        int size = sc.nextInt();
        if(size%2==0){
        int arr[] = new int[size];
        int i=0;
        int j=0;
        for( i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int arr_max = 0;
        for( i=0;i<size;i++){
            for( j=i+1;j<size;j++){
             // max = arr[i]+arr[j];
            }
        }
    }
        System.out.println(Math.max(arr_max,(arr[i]+arr[j])));
    }
}
