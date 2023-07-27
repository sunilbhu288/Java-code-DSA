import java.util.Scanner;
public class Test27 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(factNum(n));
  }
  public static int factNum(int n){
    if(n==0){
      return 1;
    }
    int k = factNum(n-1);
    int ans = n*k;
    return ans;
  }
}
