import java.util.*;
public class Demo12 {
  public static void main(String []arsg){
    int arr[] = {1,1,2};

    HashSet<Integer>set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
      set.add(arr[i]);
      
    }
    System.out.print(set+" ");
    System.out.println(set.size());
  }
}
