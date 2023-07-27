import java.util.Scanner;
public class OnlyTest8 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a+" "+b+" ") ;
    
    recursionFib(0,1,n-2);


  }
  public static void recursionFib(int a, int b, int n){
    if(n==0){
      return;
    }
   int c = a+b;
   System.out.print(c+" ");
    recursionFib(b,c,n-1);
  }
}
