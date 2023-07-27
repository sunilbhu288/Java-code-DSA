import java.util.Scanner;
public class OnlyTest27 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(gcdNum(a,b));

  }
  public static int gcdNum(int a, int b){
     if(a%b==0){
      return b;
     }
  
  int ans= gcdNum(b,a%b);
  return ans;
    }
}
