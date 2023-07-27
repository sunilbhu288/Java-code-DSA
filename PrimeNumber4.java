import java.util.Scanner;
public class PrimeNumber4 {
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count =0;
    if(n==0 || n==1) return ;
    for(int i=1;i<=n;i++){
      if(isPrime(i)){
        count++;
      }
    }
     System.out.print(count+" ");
    

  }
  public static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}
