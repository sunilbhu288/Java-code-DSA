import java.util.Scanner;
public class PrimeNumber3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    for(int i=m;i<=n;i++){
      if(isPrimeNumber(i)){
        System.out.print(i+" ");
      }
    }
    
  }
  public static boolean isPrimeNumber(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}
