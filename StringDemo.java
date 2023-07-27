import java.util.Scanner;
public class StringDemo {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    boolean a = true;
    String s1 = String.valueOf(a);
    System.out.println(s1);
    System.out.println(str.indexOf(3));
  }
}
