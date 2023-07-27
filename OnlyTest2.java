import java.util.Scanner;
public class OnlyTest2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    //int a = sc.nextInt();
    int n = sc.nextInt();
    //int fact = 1;


   // recursionFactorial(n,fact);

 /*   findRecursion(n,a);
  }
  // print the number 1 to n likes - 1,2,3,4,5,6,7.....,
  public static void findRecursion(int n, int a){
    if(a==n){
      return ;
    }
    System.out.print(a+" ");
    findRecursion(n,a+1);
  }
  //factorial of the number with help of void
    public static void recursionFactorial(int n,int fact){
      if(n==1){
        fact = fact*n;
        System.out.println(fact);
        return;
      }
       fact = fact*n;
       recursionFactorial(n-1,fact);*/ 
  /*      int sum =0;
       int p =1;
       sumNumber(n,sum,p);
  }
  // print the addition of n natural numbers
  public static void sumNumber(int n,int sum,int p){
    if(p==n){
      sum = sum+n;
      System.out.println(sum);
      return;
    }
      sum = sum+p;
      sumNumber(n,sum, p+1);*/
      
 /*    int ans = factorialNum(n);
      System.out.println(ans);

  }
  // factorial the number with help of int return types.
  public static int factorialNum(int n){
    if(n ==1 || n==0){
      return 1;
    }
    int x = factorialNum(n-1);
    int fact = n*x;
    return fact;*/ 
    // fibonacci series till n th term
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a+" "+b+" ");
     for(int i=2;i<=n;i++){
      c = a+b;
      System.out.print(c+" ");
      a=b;
      b=c;
     }
  }
}
