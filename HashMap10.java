import java.util.*;
public class HashMap10 {
  public static void main(String []args){
    int arr[]= {2,3,4,3,5,6,4,3,7,8,6,9};
    HashMap<Integer, Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int freq = map.get(arr[i]);
        map.put(arr[i],freq+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(Map.Entry<Integer,Integer>maentry : map.entrySet()){
      int key = maentry.getKey();
      int value = maentry.getValue();
      System.out.println(key + " " +value);
      // if(value>1){
      //   System.out.println(key);
      // }
    }
  }
}
