import java.util.*;
public class HashMap7 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch [] = str.toCharArray();
    findrepeatChar(ch);
  }
  public static void findrepeatChar(char ch[]){
    HashMap<Character,Integer>map = new HashMap<>();
    for(int i=0;i<ch.length;i++){
      if(map.containsKey(ch[i])){
        int freq = map.get(ch[i]);
        map.put(ch[i],freq+1);
      }
      else{
        map.put(ch[i],1);
      }
    }
    for(Map.Entry<Character,Integer>maEntry : map.entrySet()){
      char key = maEntry.getKey();
      int value = maEntry.getValue();
      System.out.println(key + " " + value);
    }
  }
}
