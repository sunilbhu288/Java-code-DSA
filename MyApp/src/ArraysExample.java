import java.util.Scanner;
public class ArraysExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int [size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
           for(int j =0;j<i;j++){
                int res = arr[j]-arr[i];
                if(res>0){
              System.out.print((arr[i]-arr[j])+" ");
                }
                else{
                    System.out.print("0");
                }
            }
        }
    }
}

