import java.util.*;
public class Test53 {
  public static void main(String []args){
    int arr[] = {2,3,7,5,6,4,8,9,5,4,3};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        map.remove(arr[i]);
      }
      else{
        map.put(arr[i],i);
      }
    }
    for(int ele : map.keySet()){

      System.out.print(ele+" ");
    }
  }
}
