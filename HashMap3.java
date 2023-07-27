import java.util.*;
import java.util.Scanner;
public class HashMap3 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    HashMap<Character,Integer>map = new HashMap<>();
    //char ch [] = str.toCharArray();
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      map.put(ch,i);
    }
    System.out.println(map.size());
  }
}
