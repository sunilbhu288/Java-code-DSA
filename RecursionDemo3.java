import java.util.*;
public class RecursionDemo3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt();
    System.out.print(solution(base,power));
  }
  public static int solution(int base, int power){
     if(base==0){
      return 0;
     }
     if(power==0){
      return 1;
     }
     int baseToPower = solution(base,power-1);
     int ans = base*baseToPower;
     return ans;
  }
}
