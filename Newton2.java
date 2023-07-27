import java.util.Scanner;
public class Newton2 {
  public static void main(String []args){
     Scanner sc =  new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n-1;i++){
      arr[i] = sc.nextInt();
     }
     int sum = n*(n+1)/2;
     int sum1 = 0;
     for(int i=0;i<n-1;i++){
       sum1= sum1+arr[i];
     }
     System.out.println(sum-sum1);
  }
}
