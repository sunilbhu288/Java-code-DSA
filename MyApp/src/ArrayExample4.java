import java.util.Scanner;
public class ArrayExample4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int max_arr = arr[0];
        int min_arr = arr[0];
        for(int i=0;i<size;i++){
             max = Math.max(max_arr,arr[i]);
             min = Math.min(min_arr,arr[i]);
        }
        System.out.println("maximum: "+max);
        System.out.println("minimum:"+min);

    }
}

