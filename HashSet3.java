import java.util.*;
import java.util.Arrays;
public class HashSet3 {
  public static void main(String []args){
    int arr[] = {1,2,3,2,1,4,5,6,7,5,};
    findUniqueKey(arr);
     
  }
  public static void findUniqueKey(int arr[]){
    HashSet<Integer>set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
      set.add(arr[i]);
    }
    Arrays.sort(set);
    System.out.print(set);
  }
}
