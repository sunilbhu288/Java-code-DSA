import java.util.Scanner;
public class NewtonArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int res =0;
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
             res = res + arr[i]^arr[j];
        }
        System.out.println(res);
        }
    }
}
