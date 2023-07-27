import java.util.*;
public class HashMap15 {
  public static void main(String[] args){
    HashMap<String , Integer>map = new HashMap<>();
    map.put("a",100);
    map.put("b",200);
    map.put("c",300);
    map.put("d",400);
    System.out.println(map.toString());
    int k = map.getOrDefault("c", 700);
    System.out.println(k);
  }

  
}
