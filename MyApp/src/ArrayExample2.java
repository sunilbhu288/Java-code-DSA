import java.util.Scanner;
public class ArrayExample2 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
          arr[i] = sc.nextInt();
        }
        int max_arr = arr[0];
        int min_arr = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max_arr<arr[i]){
                max_arr = arr[i];
            }
        if(min_arr>arr[i]){
            min_arr = arr[i];
        }

        }
        System.out.println("Maximum arrays: "+ max_arr);
        System.out.println("Minimum arrays: "+min_arr);
    }
}
