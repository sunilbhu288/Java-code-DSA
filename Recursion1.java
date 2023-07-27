import java.util.Scanner;
public class Recursion1 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    recurtionFunction(n);
  }
  public static void recurtionFunction(int n){
    if(n==11){
      return;
    }
    System.out.println(n);
    recurtionFunction(n+1);
  }
}
