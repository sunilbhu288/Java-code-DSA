import java.util.*;
public class HashMap18 {
  public static void main(String args []){
    int arr[] = {1,2,3,2,1,4,5,6,7,3};
    findFrequency(arr);

  }
  public static void findFrequency(int arr[]){
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int freq = map.get(arr[i]);
        map.put(arr[i],freq+1);
      }
      else{
        map.put(arr[i],0);
      }
    }
    int mf = arr[0];
    for(int ele : map.keySet()){
     // System.out.print(ele+" ");
     if(map.get(ele)>map.get(mf)){
      mf = ele;
      System.out.println(mf);
     }
      
      
    }
    // System.out.println();
    // for(int ele : map.keySet()){
    //   int f = map.get(ele);
    //   System.out.print(f+" ");
    // }
  }
}
