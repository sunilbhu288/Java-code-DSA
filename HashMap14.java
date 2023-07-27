import java.util.*;
public class HashMap14 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
     System.out.println(countSum(arr,n,k));
    }
    public static int countSum(int arr[], int n, int k){
      int ans = 0;
      HashMap<Integer,Integer>map = new HashMap<>();
      int sum = 0;
      map.put(0,1);
      for(int i=0;i<n;i++){
        sum = sum + arr[i];
        if(map.containsKey(sum-k)){
          ans = ans + map.get(sum-k);

          }
          map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
      }
    }
  

