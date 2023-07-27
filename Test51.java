import java.util.Scanner;
public class Test51 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int current_sum = 0;
    int max_sum = 0;
    for(int i=0;i<n;i++){
      current_sum = current_sum + arr[i];
      if(current_sum > max_sum){
        max_sum = current_sum;
      }
      if(current_sum < 0){
        current_sum = 0;
      }
    }
    System.out.println(max_sum);
    }
  }

