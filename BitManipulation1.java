import java.util.Scanner;
public class BitManipulation1 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos = sc.nextInt();
    int bitmask = 1<<pos;
    int finalNumber = bitmask&n;
    System.out.println(finalNumber);
  }
}
