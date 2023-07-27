import java.util.*;
public class MockInterview6 {
  public static void main(String []args){
     int arr[] = {1,2,3,4,2,3,5,3,5,2,3,5};
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
     for(Map.Entry<Integer,Integer>maVal : map.entrySet()){
      int key  = maVal.getKey();
      int value = maVal.getValue();
      
        System.out.print(key+" ");
      
        }
        System.out.println();
        for(Map.Entry<Integer,Integer>maVal : map.entrySet()){
          int key  = maVal.getKey();
          int value = maVal.getValue();
            if(value<2)
            System.out.print(key+" ");
           
            }
    

      }
      
     }
  

