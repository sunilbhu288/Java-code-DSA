import java.util.Scanner;
public class Test45 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt();
    System.out.println(baseToPower(base, power));
  }
  public static int baseToPower(int base, int power){
    if(power==0){
      return 1;
    }
    int k = baseToPower(base, power-1);
    int ans = base*k;
    return ans;  
  }
  
}
