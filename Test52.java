import java.util.*;
public class Test52 {
  public static void main(String []args){
    int arr[] = {2,3,4,5,6,3,4,2,2};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int prevFreq = map.get(arr[i]);
        map.put(arr[i],prevFreq+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(int ele : map.keySet()){
      int freq = map.get(ele);
      System.out.println(ele + " " + freq);
    }
  }
}
