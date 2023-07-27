import java.util.Scanner;
public class PrimeNumber5 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(findDigit(l,k));
  }
  public static int findDigit(int l, int k){
    int sum = 0;
    for(int i=l;i<=k;i++){
      if(isPrime(i)){
        sum = sum + (i%100)/10;
      }
      
    }
    return sum;
  }
  public static boolean isPrime(int k){
    for(int i=2;i<=Math.sqrt(k);i++){
      if(k%i==0){
        return false;
      }
    }
    return true;
  }
}
