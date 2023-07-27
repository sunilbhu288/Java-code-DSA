import java.util.Scanner;
public class Test9 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isPrime(n)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }

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
