import java.util.*;
public class RecursionDemo7 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a+" ");
    System.out.print(b+" ");
    fibonacci(a,b,n-2);
    
  }
  public static void fibonacci(int a, int b, int n){
    if(n==0){
      return;
    }
   int c = a+b;
    
    System.out.print(c+" ");
    fibonacci(b,c,n-1);
  }
}
