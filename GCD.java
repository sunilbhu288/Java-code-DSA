import java.util.Scanner;
public class GCD {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(gcd12(a,b));
  }
  public static int gcd12(int a,int b){
    if(a%b==0){
      return b;
    }
    return gcd12(b,a%b);
  }
}
