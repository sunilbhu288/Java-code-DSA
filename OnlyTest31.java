import java.util.Scanner;
public class OnlyTest31 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a+" "+b+" ");
   // int c ;
   recursionFib(a,b,n-2);
   

  }
  public static void recursionFib(int a, int b, int n){
    if(n==0){
      return ;
    }
    
    int c = a+b;
    System.out.print(c+" ");
    recursionFib(b,c,n-1);
    
  }
}
