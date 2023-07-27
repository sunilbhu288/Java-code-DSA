import java.util.Scanner;
public class OnlyTest7 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = recursionFact(n);
    System.out.println(ans);
  }
  public static int recursionFact(int n){
    if(n==1){
      return 1;
    }
    int k= recursionFact(n-1);
    int p = n*k;
    return p;
  }
}
