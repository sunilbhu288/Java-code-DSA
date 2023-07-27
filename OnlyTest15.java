import java.util.Scanner;
public class OnlyTest15 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt();
    int ans = recursionNum(base,power);
    System.out.println(ans);
  }
  public static int recursionNum(int base, int power){
        if(power==1){
          return base;
        }
        int k = recursionNum(base, power-1);
        int p = base*k;
        return p;
  }
}
