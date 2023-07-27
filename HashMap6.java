import java.util.*;
public class HashMap6 {
  public static void main(String []args){
    int arr[] = {2,3,5,4,3,7,2,8,5};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        map.remove(arr[i]);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(int ele : map.keySet()){
    System.out.print(ele + " ");
    }
  }
}
