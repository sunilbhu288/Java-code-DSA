import java.util.*;
public class OnlyTestCode {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double base = sc.nextDouble();
    double power = sc.nextDouble();
    System.out.println(solution(base, power));
  }
  public static double solution(double base, double power){
    if(power==0){
      return 1.00;
    }
    double k = solution(base, power-1);
    double ans = base*k;
    return ans;
  }
}
