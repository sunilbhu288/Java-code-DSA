import java.util.Scanner;
import java.util.Arrays;
public class NewtonArray3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        Arrays.sort(arr);
        
    }
    int x = arr.length;
        System.out.print(arr[x-1]+" "); 
        System.out.print(arr[x-2]+" ");
        System.out.print(arr[x-3]+" ");

        int size2 = sc.nextInt();
        int arr2 [] = new int[size2];
        for(int i=0;i<arr2.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
        Arrays.sort(arr2);
        
    }
    int x1 = arr2.length;
        System.out.print(arr[x1-1]+" ");
        System.out.print(arr[x1-2]+" ");
        System.out.print(arr[x1-3]+" ");
        
        int size3 = sc.nextInt();
        int arr3 [] = new int[size3];
        for(int i=0;i<arr3.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr3.length;i++){
        Arrays.sort(arr3);
        
    }
    int x3 = arr3.length;
        System.out.print(arr[x3-1]+" ");
        System.out.print(arr[x3-2]+" ");
        System.out.print(arr[x3-3]+" ");
        int p;
        p=0;
        p=10;
        System.out.println(p);

}
}
