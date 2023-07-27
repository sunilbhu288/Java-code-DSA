import java.util.Scanner;
public class OnlyTest49 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n=0 ;
    int a = 0;
    int b =1;
    int k;
    System.out.print(a+" "+b+" ");
    fibonacci(a,b,n+2);
  }
  public static void fibonacci(int a, int b ,int n){
    if(n==10){
      return;
    }
    int sum = a+b;
    System.out.print(sum+" ");
    fibonacci(b,sum,n+1);
  }
}
