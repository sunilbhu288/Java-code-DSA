import java.util.Scanner;
public class OnlyT {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch[] = str.toCharArray();
    System.out.println(ch[1]+""+ch[0]);
  }
}
