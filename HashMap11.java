import java.util.*;
public class HashMap11 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    HashMap<Character,Integer>map = new HashMap<>();
    char ch [] = str.toCharArray();
    for(int i=0;i<ch.length;i++){
    
    map.put(ch[i],3);
    }
    System.out.println(map.size());
    System.out.println(map.keySet());
    System.out.println(map.values());

  }
}
