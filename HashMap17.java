import java.util.*;
public class HashMap17 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(findLongestDivision(arr,n,k));
  }
  public static int findLongestDivision(int arr[],int n, int k){
    int ans = 0;
    HashMap<Integer,Integer>map = new HashMap<>();
    int sum = 0;
    int rem = 0;
    map.put(0,1);
    for(int i=0;i<n;i++){
      sum = sum+arr[i];
      rem = sum%k;
      if(rem<0){
        rem = rem + k;
      }
      if(map.containsKey(rem)){
        int idx = map.get(rem);
        int len = i-idx;
        if(len>ans){
          ans = len;
        }
      }
      else{
        map.put(rem,i);
      }
      
    }
    return ans;
  }
}
