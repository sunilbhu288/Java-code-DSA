import java.util.Scanner;
public class Test14 {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int s1 = sc.nextInt();
   // int s2 = sc.nextInt();
   int arr1[] = new int [s1];
   int arr2[] = new int [s1];
   int sum [] = new int [s1];
   for(int i=0;i<s1;i++){
    arr1[i] = sc.nextInt();
    arr2[i] = sc.nextInt();
    sum [i] = arr1[i]+arr2[i];
   
   System.out.print(sum[i]+" ");
}  
}
}