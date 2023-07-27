import java.util.*;
import java.util.Scanner;
public class HashMap2 {
  public static void main(String []args){
 
   HashMap<String,Integer>map = new HashMap<>();
   map.put("India",135);
   map.put("Pak",100);
   map.put("japan",50);
   map.put("India",137);
  
   System.out.println(map);
   if(map.containsKey("India"));
   System.out.println("true");
  }
}
