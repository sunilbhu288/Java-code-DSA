import java.util.*;
public class PrimeNumber6 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=500;i++){
      int ans = n+i;
      if(isPrime(ans)){
        System.out.println(ans);
        break;
      }
    }
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

