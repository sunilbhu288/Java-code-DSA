import java.util.*;
public class FibbonacciProblems {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    findIndex(n,a,b);
  }
  public static void findIndex(int n, int a, int b){
      int c = a + b;
      for(int i=2;i<n;i++){
      System.out.print(c+" ");
        a = b;
        b = c;
      }
  }
}
