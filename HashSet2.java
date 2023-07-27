import java.util.*;

import javax.lang.model.element.Element;
public class HashSet2 {
  public static void main(String []args){
    int arr[] = {1,2,3,2,1,4,5,6};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int f = map.get(arr[i]);
        map.put(arr[i],f+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    System.out.println(map);
    System.out.println();
  }
}
