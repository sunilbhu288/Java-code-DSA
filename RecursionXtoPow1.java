import java.util.Scanner;
public class RecursionXtoPow1 {
  public static void main(String [] args){
    Scanner sc =  new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int ans = recursionPow(x,n);
    System.out.println(ans);
  }
  public static int recursionPow(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int xToPowN_1 = recursionPow(x,n-1);
    int xToPown = x*xToPowN_1;
    return xToPown;
  }
}
