import java.util.*;
public class HashSet4 {
  public static void main(String []args){
    int arr1[] = {1,2,3,4,5,6,7};
    int arr2[] = {2,4,3,7,8,9,10};
    printUnion(arr1,arr2);

  }
  public static void printUnion(int arr1[],int arr2[]){
    HashSet<Integer>set = new HashSet<>();
    for(int i=0;i<arr1.length;i++){
      set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
      set.add(arr2[i]);
    }
    System.out.println(set);
  }
}
