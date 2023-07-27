import java.util.*;
public class HashMap16 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    removeCommanElement(arr,n);
  }
  public static void removeCommanElement(int arr[], int n){
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<n;i++){
      if(map.containsKey(arr[i])){
        map.remove(arr[i]);
      }
      else{
            map.put(arr[i],2);
      }
    }
    for(int ele : map.keySet()){
      int freq = map.get(ele);
      System.out.println(ele + " " +freq);
  }
 }
}
