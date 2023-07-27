import java.util.Scanner;
public class Test7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sqr=0;
        int size = sc.nextInt();
        int arr [] = new int [size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
        sqr =sqr+ arr[i]*arr[i];
        }
        System.out.println(sqr);
    }

    
}
