import java.util.Scanner;
public class OnlyTest28 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = sumOfTwoNumber(a,b);
    System.out.println(ans);
  }
  public static int sumOfTwoNumber(int a, int b){
    int sum = a+b;
    return sum;
  }
}
