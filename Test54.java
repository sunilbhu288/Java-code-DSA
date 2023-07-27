import java.util.Scanner;
public class Test54 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(findLongest(arr));
  }
  public static int findLongest(int arr[]){
    int current_sum = 0;
    int max_sum = 0;
    for(int i=0;i<arr.length;i++){
      current_sum = current_sum +arr[i];
      if(current_sum > max_sum){
        max_sum = current_sum;
      }
      if(current_sum < 0){
        current_sum = 0;
      }
    }
    return max_sum;
  }
}
