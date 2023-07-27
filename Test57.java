import java.util.*;
public class Test57 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
  }
  public static int findlongestLength(int arr[],int n){
    int mlen = 0;
    HashMap<Integer,Integer>map = new HashMap<>();
    int i = -1;
    int sum = 0;
    while(i<arr.length-1){
      i++;
      sum = sum+arr[i];
      if(!map.containsKey(sum)){
         map.put(sum,i);
      }
      else{
        int len = i-map.get(i);
        if(len>mlen){
          mlen = len;
        }
      }
    }
    return mlen;
  }
}
