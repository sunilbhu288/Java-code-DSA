import java.util.*;
//import java.util.HashMap;
public class OnlyTest51 {
  public static void main(String []args){
    HashMap<String,Integer>map=new HashMap<>();
    // put the key and Value.....
    map.put("India",135);
    map.put("China",200);
    map.put("Indonesia",10);
    map.put("pak",80);
    System.out.print(map+" ");
    // get the another value
    //map.get("India",150);
    System.out.println();
    System.out.println(map.get("India"));
    System.out.println();
    System.out.println(map.containsKey("India"));
    System.out.println(map.containsKey("Russia"));
  }
}
