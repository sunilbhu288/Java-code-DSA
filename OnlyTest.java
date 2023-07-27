import java.util.Scanner;
public class OnlyTest {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    double sum = 0;
    for(int i=0;i<n;i++){
       sum  = sum + Math.pow(arr[i],2);
    }
    //System.out.println(sum);
    double avg = sum/n;
    double t = Math.sqrt(avg);
    System.out.printf("%.6f",t);
    
  }
}
