import java.util.Scanner;
public class Test7 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(str.substring(1,3));
    // change the String to character
    for(int i=0;i<str.length();i++){
      System.out.print(str.charAt(i)+" ");
      //break;
      System.out.println(str.replace("u","b"));
    }
  }
}
