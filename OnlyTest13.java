import java.util.Scanner;
public class OnlyTest13 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt();
    int ans = recursionPow(base,power);
    System.out.println(ans);
  }
  public static int recursionPow(int base, int power){
    if(power==1){
      return base;
    }
    int k = recursionPow(base,power-1);
    int p= base*k;
    return p;
  }
}
