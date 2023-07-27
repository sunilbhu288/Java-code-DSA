import java.util.*;
public class ArrayList3 {
  public static void main(String args[]){
    int arr[] = {2,3,1,4,5,6};

    solution(arr);
  }
  public static void solution(int arr[]){
    List<Integer>list = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      list.add(arr[i]);
      System.out.println(list);
    }
  }
}
