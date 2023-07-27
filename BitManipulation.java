import java.util.*;
public class BitManipulation {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos = sc.nextInt();
    int bitmark = 1<<pos;
    if((bitmark & n) == 0){
      System.out.println("bitmark is zero");
    }
    else{
      System.out.println("bitmark is one");
    }
  }
}
