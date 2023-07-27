import java.util.*;
public class HashMap12 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    findTargetIndex(arr,k);
  }
  // this is wrong answere..............
  public static void findTargetIndex(int arr[], int k){
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      int complement = k - arr[i];
      if(map.containsKey(complement)){
        map.get(complement);
        map.get(i);
      }
      else{
        map.put(arr[i],i);
      }
    }
    for(Map.Entry<Integer,Integer>maEntry : map.entrySet()){
      int key = maEntry.getKey();
      int value = maEntry.getValue();
      if(value<2){
        System.out.print(key+" ");
      }
    }
  }
}
