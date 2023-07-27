import java.util.Scanner;
public class Test46 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int k=1;
    System.out.print(a+" "+b+" ");
    recursion(n-2,a,b,k);

  }
  public static void recursion(int n , int a, int b,int k){
    if(k==n){
      int c = a+b;
    System.out.print(c+" ");
      return;
    }
     int c = a+b;
     System.out.print(c+" ");
    recursion(n-1,b,c,k);
  }
}
