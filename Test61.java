import java.util.*;
public class Test61 {
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    String str = sc.next();
    char ch [] = str.toCharArray();
    findFirstChar(ch);
  }
  public static void findFirstChar(char ch[]){
    HashMap<Character,Integer>map = new HashMap<>();
    for(int i=0;i<ch.length;i++){
      if(map.containsKey(ch[i])){
        int f = map.get(ch[i]);
        map.put(ch[i],f+1);
      }
      else{
        map.put(ch[i],1);
      }
    }
    for(Map.Entry<Character,Integer>m : map.entrySet()){
      char key = m.getKey();
      int v = m.getValue();
      if(v>1){
        System.out.println(key);
        break;
      }
    }
  }
}
