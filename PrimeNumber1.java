import java.util.Scanner;
public class PrimeNumber1 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<=n;i++){
      if(printPrimeNumber(i)){
        System.out.print(i+" ");
      }
    }
  }
  public static boolean printPrimeNumber(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}
