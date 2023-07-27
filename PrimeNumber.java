import java.util.Scanner;
public class PrimeNumber {
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    primesum(n);
   }
   public static void primesum(int n){
    int sum = 0;
      while(n>0){
      int res = n%10;
     // System.out.print(res+" ");
      if(isPrime(res)){
        sum = sum+res;
      }
      n = n/10;
    }
    //System.out.println(sum);
   }
   public static boolean isPrime(int n){
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
   }
}
