import java.util.*;
public class HashMap13 {
  public static void main(String []args){
    int arr[] = {2,3,5,4,3,2,7,6,5,8,4,3,9,7};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int freq = map.get(arr[i]);
        map.put(arr[i],freq+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(Map.Entry<Integer,Integer>ma : map.entrySet()){
      int key = ma.getKey();
      int value = ma.getValue();
      System.out.println(key+" "+value);
    }
  }
}
