import java.util.Scanner;
public class RecursionFibonacciForIndex {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = recursionFib(n);
    System.out.println(ans);
  }
  public static int recursionFib(int n){
    if(n==1){
      return 0;
    }
    if(n==2){
      return 1;
    }
    return recursionFib(n-1) + recursionFib(n-2);
  }
  }

