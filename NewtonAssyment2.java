import java.util.*;
public class NewtonAssyment2 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long arr[] = new long[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextLong();
    }
    if(operator(arr,k,1,arr[0])){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
  public static boolean operator(long arr[], long k, int idx, long ans){
    if(idx==arr.length){
      if(k==ans){
        return true;
      }
      return false;
    }
  
  boolean posibility1 = operator(arr,k,idx+1,ans-arr[idx]);
  boolean posibility2 = operator(arr,k,idx+1,ans+arr[idx]);
  if(posibility1==true || posibility2==true){
    return true;
  }
  return false;
  }
}
