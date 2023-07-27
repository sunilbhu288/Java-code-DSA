import java.util.*;
public class StringExample1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch [] = str.toCharArray();
    for(int i=0;i<str.length();i++){
      System.out.print(ch[i]);
      if(ch[i] == ' '){
        System.out.println();
      }
    }
  }
}
