import java.util.Scanner;
public class Test18 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String result = "";
    String str = sc.nextLine();
    char ch[] = str.toCharArray(); 
    for(int i=ch.length-1;i>=0;i--){
      result = result +ch[i];
   }
    System.out.println(result);
    System.out.println(result.length());
  }
}
