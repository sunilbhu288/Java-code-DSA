import java.util.Scanner;
public class MaxArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
            }
            int max =0;
            int v=0 ;
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
            if(arr[j]>arr[i]){
              v = arr[j]-arr[i];
            }
            
            }
           
        }
        System.out.println(Math.max(max,v));
       
    }
}

