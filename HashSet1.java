import java.util.*;
public class HashSet1 {
  public static void main(String []args){
    int arr[] = {1,2,3,2,4,1,5,6};
    HashSet<Integer>set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
      set.add(arr[i]);
    
      }
      System.out.println(set);
    }
  }

