import java.util.*;
public class Test56 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch [] = str.toCharArray();
    findTheLength(ch);
  }
  public static void findTheLength(char ch[]){
    HashMap<Character,Integer>map = new HashMap<>();
    for(int i=0;i<ch.length;i++){
      if(map.containsKey(ch[i])){
        map.get(ch[i]);
        
      }
      map.put(ch[i],1);
    }
    System.out.print(map.size());
  }
}
