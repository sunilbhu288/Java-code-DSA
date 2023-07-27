import java.util.*;
public class LowestPrimeNumber {
  public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    for(int i=1;i<=n;i++){
       //int k = n-i;
       if(isPrimeNumber(n-i)){
        System.out.println(n-i);
        break;
       }
    }

  }
  public static boolean isPrimeNumber(int n){
     for(int i=2;i<=n/2;i++){
      if(n%i==0){
        return false;
      }
     }
     return true;
  }
}
