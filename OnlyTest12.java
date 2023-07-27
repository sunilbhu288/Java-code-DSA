import java.util.Scanner;
public class OnlyTest12 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();
    int i=1;
    recursionPrint(n,str,i);
  }
  public static void recursionPrint(int n, String str, int i){
    if(i==n){
      System.out.println(i+" "+str);
      return;
    }
    System.out.println(i+" "+str);
    recursionPrint(n, str,i+1);
  }
}
