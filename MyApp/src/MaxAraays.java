import java.util.Scanner;
public class MaxAraays {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    int max_array = arr[0];
    int min_array = arr[0];
    for(int i=0;i<size;i++){
        if(max_array < arr[i]){
            max_array = arr[i];
        }
    }
            System.out.println("Maximum arrays "+max_array);

        
        for(int i=0;i<size;i++){
        if(min_array>arr[i]){
            min_array = arr[i];
        }
    }
            System.out.println("Minimum arrays "+min_array);
        }
   
}

    

