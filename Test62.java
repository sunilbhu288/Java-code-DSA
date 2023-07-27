import java.util.*;
public class Test62 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
     for(int i=1;i<=number;i++){
     int n = number+i;
     if(isNearestPrime(n)){
      System.out.println(n);
      break;
     }
     n = number - i;
     if(isNearestPrime(n)){
      System.out.println(n);
      break;
     }
     }

  }
  public static boolean isNearestPrime(int n){
    for(int i=2;i<Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}
