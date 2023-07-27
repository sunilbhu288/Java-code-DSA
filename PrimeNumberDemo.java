import java.util.Scanner;
public class PrimeNumberDemo {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    while(testcase>0){
    int n = sc.nextInt();
    if(isPrimeCheak(n)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
    testcase--;
  }
  }
  public static boolean isPrimeCheak(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}
