import java.util.*;
public class HashMap4 {
  public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   HashMap<Character,Integer>map = new HashMap<>();
   for(int i=0;i<str.length();i++){
    char ch = str.charAt(i);
    map.put(ch,i);
   }
   System.out.println(map.size());
  }
}
