import java.util.Scanner;
public class OnlyTest30 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt();
    int result = power(base,power);
    System.out.println(result);
  }
  public static int power(int base, int power){
    if(power==0){
      return 1;
    }
    int v = power(base,power-1);
    int ans = base*v;
    return ans;
  }
}
