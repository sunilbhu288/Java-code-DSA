import java.util.Scanner;
public class OnlyTest35 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = recursionFac(n);
    System.out.println(result);
  }
  public static int recursionFac(int n){
    if(n==1){
      return 1;
    }
    int num = recursionFac(n-1);
    int ans = n*num;
    return ans;
  }
}
