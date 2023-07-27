import java.util.Scanner;
public class DuplicateArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
