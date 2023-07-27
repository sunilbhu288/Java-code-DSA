import java.util.*;
import java.util.Arrays;
public class Demo6 {
  public static void main(String []args){
    int arr1[] = {2,3,1,5,3,2,7,6};
    int arr2[] = {3,2,1,6,4,3,8,7};

    int k =0;
    int arr[] = new int [arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++){
      arr[k] = arr1[i];
      k++;
    }
    for(int j=0;j<arr2.length;j++){
      arr[k] = arr2[j];
      k++;
    }
    Arrays.sort(arr);
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
    for(Map.Entry<Integer,Integer>ma : map.entrySet()){
      int key = ma.getKey();
      int value = ma.getValue();
      if(value<2){
        System.out.print(key+" ");
      }
    }
  }
}
