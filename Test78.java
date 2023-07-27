import java.util.Scanner;
public class Test78 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int k=0;
    System.out.print(a+" "+b+" ");
    printFibbonaci(0,1,n-2,k);

  }
  public static void printFibbonaci(int a,int b, int n,int k){
    if(k==n){
      return;
    }
   int  c = a+b;
    System.out.print(c+" ");
    printFibbonaci(b,c,n-1,k);
  }
}
