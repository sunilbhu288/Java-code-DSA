import java.util.Scanner;
public class OnlyTest3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = recursionFib(n);
    System.out.println(k);
  }
  public static int recursionFib(int n){
    if(n==1){
      return 1;
    }
    int x = recursionFib(n-1);
    int p = n*x;
    return p;
  }
}
