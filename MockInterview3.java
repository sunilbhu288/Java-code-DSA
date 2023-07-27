
import java.util.*;
public class MockInterview3 {
  public static void main(String []args){
    int arr[] = {1,1,2,2,3,3,4,4,5};
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
      if(value<2){
        System.out.print(key);
    }
    

    }

  }
}
