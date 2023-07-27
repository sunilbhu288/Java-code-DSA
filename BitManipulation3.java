import java.util.Scanner;
public class BitManipulation3 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos = sc.nextInt();
    int bitmask = 1<<pos;
    int notpos = ~(bitmask);
    int finalValue = notpos & n;
    System.out.println(finalValue);
  }
}
