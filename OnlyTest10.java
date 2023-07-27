import java.util.Scanner;
public class OnlyTest10 {
  public static void mian(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    recursionPrint(1,str);
  }
  public static void recursionPrint(int n, String str){
    if(n==11){
      return;
    }
    System.out.print("str");
    recursionPrint(n+1,str);
  }
}
