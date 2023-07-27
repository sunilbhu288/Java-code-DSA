import java.util.*;
public class RecursionDemo8 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt();
    System.out.println( solution(base,power));
  }
  public static int solution(int base, int power){
    if(power==0){
      return 1;
    }
    int k = solution(base, power-1);
    int ans = base*k;
    return ans;
  }
}
