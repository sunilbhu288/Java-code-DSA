import java.util.Scanner;
public class OnlyTest9 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 1;
    int sum =0;
    recursionAdd(n,a,sum);

  }
  public static void recursionAdd(int n, int a, int sum){
    if(a==n){
     sum+=a;
     System.out.println(sum);
     return;
    }
     sum = sum+a;
     recursionAdd(n,a+1,sum);
  }
}
