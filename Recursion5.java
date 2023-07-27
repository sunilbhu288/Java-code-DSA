import java.util.Scanner;
public class Recursion5 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1;
    recursionfactorial(n,fact);
  }
  
  public static void recursionfactorial(int n , int fact){
    if(n==1){
      fact = fact*n;
      System.out.println(fact);
      return;
    }
    fact = fact*n;
    recursionfactorial(n-1,fact);
  }
}
