import java.util.Scanner;
public class FibonacciSeriesIndex {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = fiboIndex(n-2);
    System.out.println(ans);
  }
  public static int fiboIndex(int n){
    if(n==0){
      return 1;
    }
    if(n==1){
      return 2;
    }
    int k = fiboIndex(n-1)+fiboIndex(n-2);
    return k;
  }
}
