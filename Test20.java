import java.util.Scanner;
public class Test20 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    recurtionNumber(n);
  }

  public static void recurtionNumber(int n){
    if(n==0){
      return;
    }
    System.out.print(n+" ");
    recurtionNumber(n-1);
  }
}
