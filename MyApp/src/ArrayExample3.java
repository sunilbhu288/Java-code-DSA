import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i]>arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                }
            }
        
        
    }
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
}
}
