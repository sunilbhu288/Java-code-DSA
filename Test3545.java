
import java.util.*;
public class Test3545 {
  public static void main(String []args){
    int arr[] = {7,2,3,2,4,3,2,6,5};
    HashMap<Integer, Integer>map = new HashMap<>();
  
    for(int ele : arr){
      map.put(ele,map.getOrDefault(ele,0)+1);
    }
    int ans=-1;
    int maxValue = 0;
    for(int key : map.keySet()){
      if(map.get(key)>maxValue){
        maxValue = map.get(key);
        ans = key;
      } 
    }
    System.out.println(ans);
  }
}
