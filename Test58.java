import java.util.*;
public class Test58 {
  public static void main(String []args){
    int arr[] = {2,3,4,3,2,5,6,4,3,2,7};
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
    for(int ele : map.keySet()){
      int key = map.get(ele);
      System.out.println(ele + " "+key); 
      
    }
    
  }
}
