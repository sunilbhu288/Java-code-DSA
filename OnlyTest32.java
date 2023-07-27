import java.util.Arrays;
import java.util.Scanner;
public class OnlyTest32 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr [] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int count=0;
    for(int i=0;i>n-2;i++){
        if((arr[i]-arr[i+1])<=k)
            count++;
         if((arr[i+1]-arr[i+2])<=k)
         count++;
         if((arr[i+2]-arr[i])<=k)
         count++;
    } 
    System.out.println(count);          
}
}
  

