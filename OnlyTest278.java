import java.util.Scanner;
public class OnlyTest278 {
  public static void  main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();
    print(str,n);
  }
  public static void print(String str, int n){
    if(n==0){
      return;
    }
    System.out.println(str);
    print(str,n-1);
  }
}
