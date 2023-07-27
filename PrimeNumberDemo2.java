import java.util.Scanner;
public class PrimeNumberDemo2 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    for(int i=1;i<n;i++){
      if(isPrime(i)){
        count++;
        //System.out.print(i+" ");
      }
    }
    System.out.println(count);
  }
  public static boolean isPrime(int n ){
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}
