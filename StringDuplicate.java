import java.util.*;
public class StringDuplicate {
  public static void main(String []args){
    String str = "newtonschool";
    char arr[] = str.toCharArray();
    HashMap<Character,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int f = map.get(arr[i]);
        map.put(arr[i],f+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(Map.Entry<Character,Integer>maV : map.entrySet()){
      char key = maV.getKey();
      int value = maV.getValue();
      if(value>1){
        System.out.println(key+" ");
      }
    }
  }
}
