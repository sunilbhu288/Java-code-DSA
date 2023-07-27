import java.util.Scanner;
public class OnlyTest29 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int i=1;
    recursionSum(n,i,sum);

  }
  public static void recursionSum(int n,int i,int sum){
    if(i==n){
      sum = sum+i;
      System.out.println(sum);
      return;
    }
     sum = sum+i;
    recursionSum(n,i+1,sum);
  }
}
