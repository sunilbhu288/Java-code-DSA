import java.util.*;
public class NewtonAssyment3 {
  public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
   int arr[] = new int[n];
   for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
   }
   printResult(arr,n);
  }
  public static void printResult(int arr[], int n){
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<n;i++){
      if(map.containsKey(arr[i])){
      int freq = map.get(arr[i]);
      map.put(arr[i],freq+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(Map.Entry<Integer,Integer>m : map.entrySet()){
      int key = m.getKey();
      int value = m.getValue();
      System.out.println(key+" "+value);
    }
  }
}
