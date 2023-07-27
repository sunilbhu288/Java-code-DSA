import java.util.*;
public class Test59 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch [] = str.toCharArray();
    // for(int i=0;i<ch.length;i++){
    //   ch[i] = sc.next().charAt(0);
    // }
    findDuplicateChar(ch);

  }

  public static void findDuplicateChar(char ch[]){
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
    for(Map.Entry<Character,Integer> ma : map.entrySet()){
      char key = ma.getKey();
      int value = ma.getValue();
     // System.out.println(key + " "+ value) ;
    //  if(value>1){
    //   System.out.println(key);

    //  }
     if(value<2){
      System.out.println(key);
     }
    }
  }
}
