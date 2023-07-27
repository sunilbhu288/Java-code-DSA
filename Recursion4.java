import java.util.Scanner;
public class Recursion4 {
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
   // int n = sc.nextInt(); = 10;
    int sum = 0;
    recursionSum(1,10,sum);
  }
  public static void recursionSum(int i, int n, int sum){
    if(i==n){
      sum = sum + i;
       System.out.println(sum);
      return;
    }
    sum = sum+i;
    recursionSum(i+1,n,sum);
  }
}
