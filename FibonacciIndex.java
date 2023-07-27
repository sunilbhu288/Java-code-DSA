import java.util.Scanner;
public class FibonacciIndex {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a+" "+b+" ");
    recursionFiboSeries(a,b,n-2);
  }
  public static void recursionFiboSeries(int a, int b, int n){
    if(n==0){
      return ;
    }
    int c = a+b;
    System.out.print(c+" ");
    recursionFiboSeries(b,c,n-1);
  }
}
