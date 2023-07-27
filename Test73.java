import java.util.Scanner;
public class Test73 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    findSubArray(arr,n,k);
  }
  public static void findSubArray(int arr[], int n, int k){
     int i=0;
     int j =0;
     int sum = arr[0];
     boolean flag = false;
     while(j<n&& i<n){
      if(sum==k){
        System.out.print(i+" "+j);
        flag = true;
        break;
      }
      else if(sum<k){
        j++;
        sum = sum + arr[j];
      }
      else if(sum>k){
        sum = sum - arr[i];
        i++;
      }
     }
     if(!flag){
      System.out.println("-1");
     }
  }
}
