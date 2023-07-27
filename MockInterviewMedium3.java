import java.util.*;
public class MockInterviewMedium3 {
  public static void main(String []args){
    int arr[] = {2,4,4,5,6,1,2,4,5};
    int count =0;
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        count++;
        int freq = map.get(arr[i]);
        map.put(arr[i],freq+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
       
      for(Map.Entry<Integer,Integer>maValue : map.entrySet()){
        int set = maValue.getKey();
        int value = maValue.getValue();
        if(value > 2){
          System.out.println(set);
        }

      }
  }
}
